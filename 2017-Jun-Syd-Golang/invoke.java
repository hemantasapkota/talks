import go.demo.Demo;

Task.callInBackground(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                byte[] data = Demo.GetNotifications();
                String dataJson = new String(data, "UTF-8");
                // process json
                return null;
            }
        }).continueWith(new Continuation<Object, Object>() {
            @Override
            public Object then(Task<Object> task) throws Exception {
                // Render data
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR);