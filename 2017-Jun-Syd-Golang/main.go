package demo

import "encoding/json"

//Notification ...
type Notification struct {
	Title   string `json:"title"`
	Content string `json:"content"`
}

//GetNotifications ...
func GetNotifications() ([]byte, error) {
	notifs := make([]Notification, 0)
	notifs = append(notifs, Notification{"You've recieved a mail.", "Hi there, thanks for..."})

	data, err := json.Marshal(notifs)
	if err != nil {
		return nil, err
	}
	return data, nil
}
