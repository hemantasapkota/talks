let goQ = DispatchQueue(label: "goQueue", attributes: DispatchQueue.Attributes.concurrent)

func GetNotification(completion:@escaping (_ notifications:[AnyObject]?)->()) -> Void {
    goQ.async(execute: {
        var data:NSData? = nil
        var error:NSError? = nil

        GoDemoGetNotifications(&response, &error)
        if error != nil {
            // log error
        } 

        var notifications:AnyObject?
        do {
            notifications = try JSONSerialization.jsonObject(with: data as! Data, options: JSONSerialization.ReadingOptions())
        } catch let err as NSError {
            // log error
        }

        DispatchQueue.main.async(execute: { () -> Void in
            completion(notifications)
        })
    })
}