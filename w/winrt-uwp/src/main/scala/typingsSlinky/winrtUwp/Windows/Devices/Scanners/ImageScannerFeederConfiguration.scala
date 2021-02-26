package typingsSlinky.winrtUwp.Windows.Devices.Scanners

import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import typingsSlinky.winrtUwp.Windows.Foundation.Size
import typingsSlinky.winrtUwp.Windows.Graphics.Printing.PrintMediaSize
import typingsSlinky.winrtUwp.Windows.Graphics.Printing.PrintOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the Feeder scan source of the scanner. */
@js.native
trait ImageScannerFeederConfiguration extends StObject {
  
  /** Gets the actual horizontal and vertical scan resolution for the scanner's Feeder, in DPI. */
  var actualResolution: ImageScannerResolution = js.native
  
  /** Gets or sets the automatic crop mode. */
  var autoCroppingMode: ImageScannerAutoCroppingMode = js.native
  
  /** Gets or sets the page size automatic detection feature for the scanner's Feeder. */
  var autoDetectPageSize: Boolean = js.native
  
  /** Gets or sets the current brightness level for capturing image data from the scanner's Feeder. At the beginning of a new scan session, this property is set to the DefaultBrightness property. */
  var brightness: Double = js.native
  
  /** Gets the step size at which the brightness levels of the data source can be increased or decreased between the minimum and maximum values. */
  var brightnessStep: Double = js.native
  
  /** Returns True if the device can automatically detect at scan time the size of the document pages scanned through the Feeder; otherwise returns False. */
  var canAutoDetectPageSize: Boolean = js.native
  
  /** Gets whether the scanner device is capable of scanning ahead from its Feeder. */
  var canScanAhead: Boolean = js.native
  
  /** Gets whether the scanner's Feeder is capable of duplex scanning (scanning both document page sides, front and back). When scanning in duplex mode the same scan settings (such as color mode and scan resolution) are applied to scan both page sides. */
  var canScanDuplex: Boolean = js.native
  
  /** Gets or sets the color mode for the scanner's Feeder. */
  var colorMode: ImageScannerColorMode = js.native
  
  /** Sets or gets the current contrast level for capturing image data from the scanner's Feeder. At the beginning of a new scan session this property is set to the DefaultContrast property. */
  var contrast: Double = js.native
  
  /** Gets the step size at which the contrast levels of the data source can increase or decrease between the minimum and maximum values. */
  var contrastStep: Double = js.native
  
  /** Gets the default brightness level for the scanner's Feeder. */
  var defaultBrightness: Double = js.native
  
  /** Gets the default color mode for the scanner's Feeder. */
  var defaultColorMode: ImageScannerColorMode = js.native
  
  /** Gets the default contrast level for the scanner's Feeder. */
  var defaultContrast: Double = js.native
  
  /** Gets the default file format for the scanner's Feeder at the beginning of a new scan session. */
  var defaultFormat: ImageScannerFormat = js.native
  
  /** Gets or sets the horizontal and vertical scan resolution for the scanner's Feeder that the app requests, in DPI. */
  var desiredResolution: ImageScannerResolution = js.native
  
  /** Indicates whether the scanner's Feeder can scan both document page sides. */
  var duplex: Boolean = js.native
  
  /** Gets or sets the current file transfer format for image data acquisition from the scanner's Feeder to the client app. */
  var format: ImageScannerFormat = js.native
  
  /**
    * Returns whether the scanner's Feeder supports the specified ImageScannerAutoCroppingMode .
    * @param value The auto crop mode of the image to scan.
    * @return Indicates whether the device supports value mode.
    */
  def isAutoCroppingModeSupported(value: ImageScannerAutoCroppingMode): Boolean = js.native
  
  /**
    * Returns whether the scanner's Feeder can scan and transfer images in the specified color mode.
    * @param value The color mode.
    * @return Indicates whether the scanner can scan images in value mode.
    */
  def isColorModeSupported(value: ImageScannerColorMode): Boolean = js.native
  
  /**
    * Determines whether the scanner's Feeder supports the specified file format or not.
    * @param value The file type.
    * @return Indicates whether the specified file type is supported.
    */
  def isFormatSupported(value: ImageScannerFormat): Boolean = js.native
  
  /**
    * Returns whether the Feeder can scan documents in the specified page size and orientation.
    * @param pageSize The page size.
    * @param pageOrientation The page orientation.
    * @return Indicates the scanner can scan with pageSize and pageOrientation values.
    */
  def isPageSizeSupported(pageSize: PrintMediaSize, pageOrientation: PrintOrientation): Boolean = js.native
  
  /** Gets the maximum brightness level supported by the scanner's Feeder. */
  var maxBrightness: Double = js.native
  
  /** Gets the maximum contrast level supported by the scanner's Feeder. */
  var maxContrast: Double = js.native
  
  /** Gets or sets the maximum number of pages-not images, the app can scan in one scan job, before the scanner stops. */
  var maxNumberOfPages: Double = js.native
  
  /** Gets the maximum horizontal and vertical scan resolution of the scanner's Feeder in DPI. */
  var maxResolution: ImageScannerResolution = js.native
  
  /** Gets the maximum scan area dimensions in inches. The maximum scan width is the widest a document can be in order for the scanner's Feeder to scan it. */
  var maxScanArea: Size = js.native
  
  /** Gets the minimum brightness level supported by the scanner's Feeder. */
  var minBrightness: Double = js.native
  
  /** Gets the minimum contrast level supported by the scanner's Feeder. */
  var minContrast: Double = js.native
  
  /** Gets the minimum horizontal and vertical scan resolution of the scanner's Feeder in DPI. */
  var minResolution: ImageScannerResolution = js.native
  
  /** Gets the minimum scan area in inches. The minimum scan area is the smallest size a document can have in order for a Feeder to scan it. */
  var minScanArea: Size = js.native
  
  /** Gets the optical horizontal and vertical scan resolution of the scanner's Feeder in DPI. */
  var opticalResolution: ImageScannerResolution = js.native
  
  /** Gets or sets the currently selected page orientation that tells how to place the documents in the scanner's Feeder input tray. */
  var pageOrientation: PrintOrientation = js.native
  
  /** Gets or sets the currently selected page size to scan from the Feeder. */
  var pageSize: PrintMediaSize = js.native
  
  /** Gets the dimensions (width and height) and orientation of the selected page size, in mil units (1/1000"). */
  var pageSizeDimensions: Size = js.native
  
  /** Indicates whether or not to scan ahead. */
  var scanAhead: Boolean = js.native
  
  /** Gets or sets the origin coordinates (horizontal and vertical) and dimensions (width and height) of the selected scan area, in inches. This property is ignored when the AutoCroppingMode property is not Disabled. */
  var selectedScanRegion: Rect = js.native
}
object ImageScannerFeederConfiguration {
  
  @scala.inline
  def apply(
    actualResolution: ImageScannerResolution,
    autoCroppingMode: ImageScannerAutoCroppingMode,
    autoDetectPageSize: Boolean,
    brightness: Double,
    brightnessStep: Double,
    canAutoDetectPageSize: Boolean,
    canScanAhead: Boolean,
    canScanDuplex: Boolean,
    colorMode: ImageScannerColorMode,
    contrast: Double,
    contrastStep: Double,
    defaultBrightness: Double,
    defaultColorMode: ImageScannerColorMode,
    defaultContrast: Double,
    defaultFormat: ImageScannerFormat,
    desiredResolution: ImageScannerResolution,
    duplex: Boolean,
    format: ImageScannerFormat,
    isAutoCroppingModeSupported: ImageScannerAutoCroppingMode => Boolean,
    isColorModeSupported: ImageScannerColorMode => Boolean,
    isFormatSupported: ImageScannerFormat => Boolean,
    isPageSizeSupported: (PrintMediaSize, PrintOrientation) => Boolean,
    maxBrightness: Double,
    maxContrast: Double,
    maxNumberOfPages: Double,
    maxResolution: ImageScannerResolution,
    maxScanArea: Size,
    minBrightness: Double,
    minContrast: Double,
    minResolution: ImageScannerResolution,
    minScanArea: Size,
    opticalResolution: ImageScannerResolution,
    pageOrientation: PrintOrientation,
    pageSize: PrintMediaSize,
    pageSizeDimensions: Size,
    scanAhead: Boolean,
    selectedScanRegion: Rect
  ): ImageScannerFeederConfiguration = {
    val __obj = js.Dynamic.literal(actualResolution = actualResolution.asInstanceOf[js.Any], autoCroppingMode = autoCroppingMode.asInstanceOf[js.Any], autoDetectPageSize = autoDetectPageSize.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], brightnessStep = brightnessStep.asInstanceOf[js.Any], canAutoDetectPageSize = canAutoDetectPageSize.asInstanceOf[js.Any], canScanAhead = canScanAhead.asInstanceOf[js.Any], canScanDuplex = canScanDuplex.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], contrastStep = contrastStep.asInstanceOf[js.Any], defaultBrightness = defaultBrightness.asInstanceOf[js.Any], defaultColorMode = defaultColorMode.asInstanceOf[js.Any], defaultContrast = defaultContrast.asInstanceOf[js.Any], defaultFormat = defaultFormat.asInstanceOf[js.Any], desiredResolution = desiredResolution.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isAutoCroppingModeSupported = js.Any.fromFunction1(isAutoCroppingModeSupported), isColorModeSupported = js.Any.fromFunction1(isColorModeSupported), isFormatSupported = js.Any.fromFunction1(isFormatSupported), isPageSizeSupported = js.Any.fromFunction2(isPageSizeSupported), maxBrightness = maxBrightness.asInstanceOf[js.Any], maxContrast = maxContrast.asInstanceOf[js.Any], maxNumberOfPages = maxNumberOfPages.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any], maxScanArea = maxScanArea.asInstanceOf[js.Any], minBrightness = minBrightness.asInstanceOf[js.Any], minContrast = minContrast.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], minScanArea = minScanArea.asInstanceOf[js.Any], opticalResolution = opticalResolution.asInstanceOf[js.Any], pageOrientation = pageOrientation.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pageSizeDimensions = pageSizeDimensions.asInstanceOf[js.Any], scanAhead = scanAhead.asInstanceOf[js.Any], selectedScanRegion = selectedScanRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerFeederConfiguration]
  }
  
  @scala.inline
  implicit class ImageScannerFeederConfigurationMutableBuilder[Self <: ImageScannerFeederConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualResolution(value: ImageScannerResolution): Self = StObject.set(x, "actualResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCroppingMode(value: ImageScannerAutoCroppingMode): Self = StObject.set(x, "autoCroppingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDetectPageSize(value: Boolean): Self = StObject.set(x, "autoDetectPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightnessStep(value: Double): Self = StObject.set(x, "brightnessStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanAutoDetectPageSize(value: Boolean): Self = StObject.set(x, "canAutoDetectPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanScanAhead(value: Boolean): Self = StObject.set(x, "canScanAhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanScanDuplex(value: Boolean): Self = StObject.set(x, "canScanDuplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMode(value: ImageScannerColorMode): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrastStep(value: Double): Self = StObject.set(x, "contrastStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBrightness(value: Double): Self = StObject.set(x, "defaultBrightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColorMode(value: ImageScannerColorMode): Self = StObject.set(x, "defaultColorMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultContrast(value: Double): Self = StObject.set(x, "defaultContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFormat(value: ImageScannerFormat): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredResolution(value: ImageScannerResolution): Self = StObject.set(x, "desiredResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplex(value: Boolean): Self = StObject.set(x, "duplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ImageScannerFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoCroppingModeSupported(value: ImageScannerAutoCroppingMode => Boolean): Self = StObject.set(x, "isAutoCroppingModeSupported", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsColorModeSupported(value: ImageScannerColorMode => Boolean): Self = StObject.set(x, "isColorModeSupported", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFormatSupported(value: ImageScannerFormat => Boolean): Self = StObject.set(x, "isFormatSupported", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsPageSizeSupported(value: (PrintMediaSize, PrintOrientation) => Boolean): Self = StObject.set(x, "isPageSizeSupported", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMaxBrightness(value: Double): Self = StObject.set(x, "maxBrightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxContrast(value: Double): Self = StObject.set(x, "maxContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumberOfPages(value: Double): Self = StObject.set(x, "maxNumberOfPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResolution(value: ImageScannerResolution): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScanArea(value: Size): Self = StObject.set(x, "maxScanArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBrightness(value: Double): Self = StObject.set(x, "minBrightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinContrast(value: Double): Self = StObject.set(x, "minContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinResolution(value: ImageScannerResolution): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScanArea(value: Size): Self = StObject.set(x, "minScanArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpticalResolution(value: ImageScannerResolution): Self = StObject.set(x, "opticalResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageOrientation(value: PrintOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: PrintMediaSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeDimensions(value: Size): Self = StObject.set(x, "pageSizeDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanAhead(value: Boolean): Self = StObject.set(x, "scanAhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedScanRegion(value: Rect): Self = StObject.set(x, "selectedScanRegion", value.asInstanceOf[js.Any])
  }
}
