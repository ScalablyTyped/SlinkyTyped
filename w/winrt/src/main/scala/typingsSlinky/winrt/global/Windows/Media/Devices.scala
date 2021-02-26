package typingsSlinky.winrt.global.Windows.Media

import typingsSlinky.winrt.Windows.Media.Devices.AudioDeviceRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Devices {
  
  @JSGlobal("Windows.Media.Devices.AudioDeviceController")
  @js.native
  class AudioDeviceController ()
    extends typingsSlinky.winrt.Windows.Media.Devices.AudioDeviceController
  
  @JSGlobal("Windows.Media.Devices.AudioDeviceRole")
  @js.native
  object AudioDeviceRole extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Media.Devices.AudioDeviceRole with Double] = js.native
    
    /* 0 */ val default: typingsSlinky.winrt.Windows.Media.Devices.AudioDeviceRole.default with Double = js.native
    
    /* 1 */ val communications: typingsSlinky.winrt.Windows.Media.Devices.AudioDeviceRole.communications with Double = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.CallControl")
  @js.native
  class CallControl ()
    extends typingsSlinky.winrt.Windows.Media.Devices.CallControl
  /* static members */
  object CallControl {
    
    @JSGlobal("Windows.Media.Devices.CallControl.fromId")
    @js.native
    def fromId(deviceInterfaceId: String): typingsSlinky.winrt.Windows.Media.Devices.CallControl = js.native
    
    @JSGlobal("Windows.Media.Devices.CallControl.getDefault")
    @js.native
    def getDefault(): typingsSlinky.winrt.Windows.Media.Devices.CallControl = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs")
  @js.native
  class DefaultAudioCaptureDeviceChangedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
  
  @JSGlobal("Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs")
  @js.native
  class DefaultAudioRenderDeviceChangedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
  
  @JSGlobal("Windows.Media.Devices.DialRequestedEventArgs")
  @js.native
  class DialRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.Devices.DialRequestedEventArgs
  
  @JSGlobal("Windows.Media.Devices.KeypadPressedEventArgs")
  @js.native
  class KeypadPressedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.Devices.KeypadPressedEventArgs
  
  @JSGlobal("Windows.Media.Devices.MediaDevice")
  @js.native
  class MediaDevice ()
    extends typingsSlinky.winrt.Windows.Media.Devices.MediaDevice
  /* static members */
  object MediaDevice {
    
    @JSGlobal("Windows.Media.Devices.MediaDevice")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.getAudioCaptureSelector")
    @js.native
    def getAudioCaptureSelector(): String = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.getAudioRenderSelector")
    @js.native
    def getAudioRenderSelector(): String = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.getDefaultAudioCaptureId")
    @js.native
    def getDefaultAudioCaptureId(role: AudioDeviceRole): String = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.getDefaultAudioRenderId")
    @js.native
    def getDefaultAudioRenderId(role: AudioDeviceRole): String = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.getVideoCaptureSelector")
    @js.native
    def getVideoCaptureSelector(): String = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.ondefaultaudiocapturedevicechanged")
    @js.native
    def ondefaultaudiocapturedevicechanged: js.Any = js.native
    @scala.inline
    def ondefaultaudiocapturedevicechanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiocapturedevicechanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.ondefaultaudiorenderdevicechanged")
    @js.native
    def ondefaultaudiorenderdevicechanged: js.Any = js.native
    @scala.inline
    def ondefaultaudiorenderdevicechanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiorenderdevicechanged")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Media.Devices.MediaDeviceControl")
  @js.native
  class MediaDeviceControl ()
    extends typingsSlinky.winrt.Windows.Media.Devices.MediaDeviceControl
  
  @JSGlobal("Windows.Media.Devices.MediaDeviceControlCapabilities")
  @js.native
  class MediaDeviceControlCapabilities ()
    extends typingsSlinky.winrt.Windows.Media.Devices.MediaDeviceControlCapabilities
  
  @JSGlobal("Windows.Media.Devices.RedialRequestedEventArgs")
  @js.native
  class RedialRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.Devices.RedialRequestedEventArgs
  
  @JSGlobal("Windows.Media.Devices.TelephonyKey")
  @js.native
  object TelephonyKey extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey with Double] = js.native
    
    /* 12 */ val a: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.a with Double = js.native
    
    /* 13 */ val b: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.b with Double = js.native
    
    /* 14 */ val c: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.c with Double = js.native
    
    /* 15 */ val d: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d with Double = js.native
    
    /* 0 */ val d0: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d0 with Double = js.native
    
    /* 1 */ val d1: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d1 with Double = js.native
    
    /* 2 */ val d2: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d2 with Double = js.native
    
    /* 3 */ val d3: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d3 with Double = js.native
    
    /* 4 */ val d4: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d4 with Double = js.native
    
    /* 5 */ val d5: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d5 with Double = js.native
    
    /* 6 */ val d6: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d6 with Double = js.native
    
    /* 7 */ val d7: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d7 with Double = js.native
    
    /* 8 */ val d8: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d8 with Double = js.native
    
    /* 9 */ val d9: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.d9 with Double = js.native
    
    /* 11 */ val pound: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.pound with Double = js.native
    
    /* 10 */ val star: typingsSlinky.winrt.Windows.Media.Devices.TelephonyKey.star with Double = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.VideoDeviceController")
  @js.native
  class VideoDeviceController ()
    extends typingsSlinky.winrt.Windows.Media.Devices.VideoDeviceController
}
