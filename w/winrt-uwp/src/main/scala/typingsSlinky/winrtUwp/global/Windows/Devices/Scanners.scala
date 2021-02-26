package typingsSlinky.winrtUwp.global.Windows.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the classes, interfaces, structures and other components that are built on top of the Windows Image Acquisition (WIA) COM APIs to provide scan functionality for Windows Store apps and desktop apps. */
object Scanners {
  
  /** Represents the properties of images to scan. */
  @JSGlobal("Windows.Devices.Scanners.ImageScanner")
  @js.native
  abstract class ImageScanner ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScanner
  object ImageScanner {
    
    /**
      * Creates an instance of a ImageScanner object based on a scanners device information ID. This method is required for broker device enumeration.
      * @param deviceId The device information ID. See DeviceInformation.Id property.
      * @return The ImageScanner object.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Scanners.ImageScanner.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScanner] = js.native
    
    /**
      * Returns the class selection string that apps can use to enumerate scanner devices. This method is required for the brokered device enumeration.
      * @return The class selection.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Scanners.ImageScanner.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
  }
  
  /** Represents the auto-configured scan source of the scanner. */
  @JSGlobal("Windows.Devices.Scanners.ImageScannerAutoConfiguration")
  @js.native
  abstract class ImageScannerAutoConfiguration ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoConfiguration
  
  /** Specifies the automatic crop mode of the scanning device. */
  @JSGlobal("Windows.Devices.Scanners.ImageScannerAutoCroppingMode")
  @js.native
  object ImageScannerAutoCroppingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode with Double
      ] = js.native
    
    /* 0 */ val disabled: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.disabled with Double = js.native
    
    /* 2 */ val multipleRegion: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.multipleRegion with Double = js.native
    
    /* 1 */ val singleRegion: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.singleRegion with Double = js.native
  }
  
  /** Specifies the color modes for the scan source. */
  @JSGlobal("Windows.Devices.Scanners.ImageScannerColorMode")
  @js.native
  object ImageScannerColorMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode with Double
      ] = js.native
    
    /* 3 */ val autoColor: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.autoColor with Double = js.native
    
    /* 0 */ val color: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.color with Double = js.native
    
    /* 1 */ val grayscale: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.grayscale with Double = js.native
    
    /* 2 */ val monochrome: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.monochrome with Double = js.native
  }
  
  /** Represents the Feeder scan source of the scanner. */
  @JSGlobal("Windows.Devices.Scanners.ImageScannerFeederConfiguration")
  @js.native
  abstract class ImageScannerFeederConfiguration ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerFeederConfiguration
  
  /** Represents the Flatbed scan source of the scanner. */
  @JSGlobal("Windows.Devices.Scanners.ImageScannerFlatbedConfiguration")
  @js.native
  abstract class ImageScannerFlatbedConfiguration ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerFlatbedConfiguration
  
  /** The type of files to scan to. */
  @JSGlobal("Windows.Devices.Scanners.ImageScannerFormat")
  @js.native
  object ImageScannerFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat with Double] = js.native
    
    /* 2 */ val deviceIndependentBitmap: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.deviceIndependentBitmap with Double = js.native
    
    /* 0 */ val jpeg: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.jpeg with Double = js.native
    
    /* 5 */ val openXps: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.openXps with Double = js.native
    
    /* 6 */ val pdf: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.pdf with Double = js.native
    
    /* 1 */ val png: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.png with Double = js.native
    
    /* 3 */ val tiff: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.tiff with Double = js.native
    
    /* 4 */ val xps: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.xps with Double = js.native
  }
  
  /** Represents the result of a preview scan job. */
  @JSGlobal("Windows.Devices.Scanners.ImageScannerPreviewResult")
  @js.native
  abstract class ImageScannerPreviewResult ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerPreviewResult
  
  /** Represents the result of a scan job. */
  @JSGlobal("Windows.Devices.Scanners.ImageScannerScanResult")
  @js.native
  abstract class ImageScannerScanResult ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerScanResult
  
  /** The types of scan source for the scanning device. */
  @JSGlobal("Windows.Devices.Scanners.ImageScannerScanSource")
  @js.native
  object ImageScannerScanSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource with Double
      ] = js.native
    
    /* 0 */ val default: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.default with Double = js.native
    
    /* 3 */ val autoConfigured: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.autoConfigured with Double = js.native
    
    /* 2 */ val feeder: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.feeder with Double = js.native
    
    /* 1 */ val flatbed: typingsSlinky.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.flatbed with Double = js.native
  }
}
