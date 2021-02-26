package typingsSlinky.tizenCommonWeb

import typingsSlinky.tizenCommonWeb.tizenMod.ErrorCallback
import typingsSlinky.tizenCommonWeb.tizenMod.SuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tvinputdeviceMod {
  
  @js.native
  trait InputDeviceKey extends StObject {
    
    /**
      * The numeric code of the key, like ***37*** or ***13***.
      * @since 2.3
      */
    var code: Double = js.native
    
    /**
      * The name of the key, for example ***"VolumeUp"*** or ***"ChannelDown"***.
      * @since 2.3
      */
    var name: InputDeviceKeyName = js.native
  }
  object InputDeviceKey {
    
    @scala.inline
    def apply(code: Double, name: InputDeviceKeyName): InputDeviceKey = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputDeviceKey]
    }
    
    @scala.inline
    implicit class InputDeviceKeyMutableBuilder[Self <: InputDeviceKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: InputDeviceKeyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type InputDeviceKeyName = String
  
  @js.native
  trait TVInputDeviceManager extends StObject {
    
    /**
      * Returns information about the key which has the given name.
      * @returns InputDeviceKey InputDeviceKey object for the given key name, or null if the key is not supported.
      * @param keyName The name of the key to retrieve.
      * @privilegeLevel Public
      * @privilegeName http://tizen.org/privilege/tv.inputdevice
      * @throw WebAPIException SecurityError, InvalidValuesError,UnknownError
      * @since 2.3
      */
    def getKey(keyName: InputDeviceKeyName): InputDeviceKey | Null = js.native
    
    /**
      * Retrieves the list of keys can be registered with the `registerKey()` method.
      * Mandatory keys will not be retrieved by this method.
      * @returns InputDeviceKey InputDeviceKey array for the supported key name.
      * @privilegeLevel Public
      * @privilegeName http://tizen.org/privilege/tv.inputdevice
      * @throw WebAPIException SecurityError, UnknownError
      * @since 2.3
      */
    def getSupportedKeys(): js.Array[InputDeviceKey] = js.native
    
    /**
      * Registers an input device key to receive DOM keyboard event when it is pressed or released.
      * When an application wants to react to the Input Device keys being pressed, it should register this key.
      * An application cannot register the mandatory keys (ArrowLeft, ArrowRight, ArrowUp, ArrowDown, Enter, Back).
      * @param keyName The name of the key which should generate DOM key events when pressed.
      * @privilegeLevel Public
      * @privilegeName http://tizen.org/privilege/tv.inputdevice
      * @throw WebAPIException SecurityError, InvalidValuesError, UnknownError
      * @since 2.3
      */
    def registerKey(keyName: InputDeviceKeyName): Unit = js.native
    
    /**
      * Registers a batch of input device keys to receive DOM keyboard events when any of them is pressed or released.
      * When an application wants to react to the input device key presses, it should register those keys.
      * An application cannot register the mandatory keys (ArrowLeft, ArrowRight, ArrowUp, ArrowDown, Enter, Back).
      * @param keyNames The array with the names of the keys which will generate DOM key events when they are pressed.
      * @param successCallback Callback method to be invoked when keys are registered.
      * @param errorCallback Callback method to be invoked when an error has occurred.
      * - `InvalidValuesError`: If any of the given keyNames is invalid or not supported.
      * - `UnknownError`: In case of any other error.
      * @privilegeLevel Public
      * @privilegeName http://tizen.org/privilege/tv.inputdevice
      * @throw WebAPIException SecurityError, InvalidValuesError, TypeMismatchError, UnknownError
      * @since 2.4
      */
    def registerKeyBatch(keyNames: js.Array[InputDeviceKeyName]): Unit = js.native
    def registerKeyBatch(
      keyNames: js.Array[InputDeviceKeyName],
      successCallback: js.UndefOr[scala.Nothing],
      errorCallback: ErrorCallback
    ): Unit = js.native
    def registerKeyBatch(keyNames: js.Array[InputDeviceKeyName], successCallback: SuccessCallback): Unit = js.native
    def registerKeyBatch(
      keyNames: js.Array[InputDeviceKeyName],
      successCallback: SuccessCallback,
      errorCallback: ErrorCallback
    ): Unit = js.native
    
    /**
      * Unregisters an input device key.
      * @param keyName keyName The name of the key which should not be monitored any longer.
      * @privilegeLevel Public
      * @privilegeName http://tizen.org/privilege/tv.inputdevice
      * @throw WebAPIException SecurityError, InvalidValuesError, UnknownError
      * @since 2.3
      */
    def unregisterKey(keyName: InputDeviceKeyName): Unit = js.native
    
    /**
      * Unregisters a batch of input device keys.
      * @param keyNames The array with the names of the keys to unregister.
      * @param successCallback Callback method to be invoked when keys are unregistered.
      * @param errorCallback Callback method to be invoked when an error has occurred.
      * - `InvalidValuesError`: If any of the given keyNames is invalid or not supported.
      * - `UnknownError`: In case of any other error.
      * @privilegeLevel Public
      * @privilegeName http://tizen.org/privilege/tv.inputdevice
      * @throw WebAPIException SecurityError, InvalidValuesError, TypeMismatchError, UnknownError
      * @since 2.4
      */
    def unregisterKeyBatch(keyNames: js.Array[InputDeviceKeyName]): Unit = js.native
    def unregisterKeyBatch(
      keyNames: js.Array[InputDeviceKeyName],
      successCallback: js.UndefOr[scala.Nothing],
      errorCallback: ErrorCallback
    ): Unit = js.native
    def unregisterKeyBatch(keyNames: js.Array[InputDeviceKeyName], successCallback: SuccessCallback): Unit = js.native
    def unregisterKeyBatch(
      keyNames: js.Array[InputDeviceKeyName],
      successCallback: SuccessCallback,
      errorCallback: ErrorCallback
    ): Unit = js.native
  }
}
