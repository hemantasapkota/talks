import { NativeModules } from 'react-native';

<Button onPress={() => {

NativeModules.Commander.execute(

    { 'command': 'load_notifications' },

    (data) => { 
        // process and render data
    },

    (error) => { 
        // Handle error
    }
)}

</Button>