package typingsSlinky.winrtUwp.Windows.Graphics

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.colorprofilechanged
import typingsSlinky.winrtUwp.winrtUwpStrings.dpichanged
import typingsSlinky.winrtUwp.winrtUwpStrings.orientationchanged
import typingsSlinky.winrtUwp.winrtUwpStrings.stereoenabledchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains components to determine aspects of a physical display. */
object Display {
  
  @js.native
  sealed trait DisplayOrientations extends StObject
  /** Describes the orientation of a rectangular monitor. */
  @JSGlobal("Windows.Graphics.Display.DisplayOrientations")
  @js.native
  object DisplayOrientations extends StObject {
    
    /** Specifies that the monitor is oriented in landscape mode where the width of the display viewing area is greater than the height. */
    @js.native
    sealed trait landscape extends DisplayOrientations
    
    /** Specifies that the monitor rotated another 90 degrees in the clockwise direction (to equal 180 degrees) to orient the display in landscape mode where the width of the display viewing area is greater than the height. This landscape mode is flipped 180 degrees from the Landscape mode. */
    @js.native
    sealed trait landscapeFlipped extends DisplayOrientations
    
    /** No display orientation is specified. */
    @js.native
    sealed trait none extends DisplayOrientations
    
    /** Specifies that the monitor rotated 90 degrees in the clockwise direction to orient the display in portrait mode where the height of the display viewing area is greater than the width. */
    @js.native
    sealed trait portrait extends DisplayOrientations
    
    /** Specifies that the monitor rotated another 90 degrees in the clockwise direction (to equal 270 degrees) to orient the display in portrait mode where the height of the display viewing area is greater than the width. This portrait mode is flipped 180 degrees from the Portrait mode. */
    @js.native
    sealed trait portraitFlipped extends DisplayOrientations
  }
  
  @js.native
  sealed trait ResolutionScale extends StObject
  /** Describes the scale factor of the immersive environment. The scale factor is determined by the operating system in response to high pixel density screens. */
  @JSGlobal("Windows.Graphics.Display.ResolutionScale")
  @js.native
  object ResolutionScale extends StObject {
    
    /** Specifies the scale of a display is invalid. */
    @js.native
    sealed trait invalid extends ResolutionScale
    
    /** Specifies the scale of a display as 100 percent. */
    @js.native
    sealed trait scale100Percent extends ResolutionScale
    
    /** This value isn't used. */
    @js.native
    sealed trait scale120Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 125 percent. */
    @js.native
    sealed trait scale125Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 140 percent. */
    @js.native
    sealed trait scale140Percent extends ResolutionScale
    
    /** Applies to Windows Phone 8. */
    @js.native
    sealed trait scale150Percent extends ResolutionScale
    
    /** Applies to Windows Phone 8. */
    @js.native
    sealed trait scale160Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 175 percent. */
    @js.native
    sealed trait scale175Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 180 percent. */
    @js.native
    sealed trait scale180Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 200 percent. */
    @js.native
    sealed trait scale200Percent extends ResolutionScale
    
    /** This value isn't used. */
    @js.native
    sealed trait scale225Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 250 percent. */
    @js.native
    sealed trait scale250Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 300 percent. */
    @js.native
    sealed trait scale300Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 350 percent. */
    @js.native
    sealed trait scale350Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 400 percent. */
    @js.native
    sealed trait scale400Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 450 percent. */
    @js.native
    sealed trait scale450Percent extends ResolutionScale
    
    /** Specifies the scale of a display as 500 percent. */
    @js.native
    sealed trait scale500Percent extends ResolutionScale
  }
  
  /** Monitors and controls physical display information. The class provides events to allow clients to monitor for changes in the display. */
  @js.native
  trait DisplayInformation extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_colorprofilechanged(`type`: colorprofilechanged, listener: TypedEventHandler[DisplayInformation, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dpichanged(`type`: dpichanged, listener: TypedEventHandler[DisplayInformation, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchanged(`type`: orientationchanged, listener: TypedEventHandler[DisplayInformation, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stereoenabledchanged(`type`: stereoenabledchanged, listener: TypedEventHandler[DisplayInformation, _]): Unit = js.native
    
    /** Gets the current orientation of a rectangular monitor. */
    var currentOrientation: DisplayOrientations = js.native
    
    /** Diagonal size of the display in inches. */
    var diagonalSizeInInches: Double = js.native
    
    /**
      * Asynchronously gets the default International Color Consortium (ICC) color profile that is associated with the physical display.
      * @return Object that manages the asynchronous retrieval of the color profile.
      */
    def getColorProfileAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
    
    /** Gets the pixels per logical inch of the current environment. */
    var logicalDpi: Double = js.native
    
    /** Gets the native orientation of the display monitor, which is typically the orientation where the buttons on the device match the orientation of the monitor. */
    var nativeOrientation: DisplayOrientations = js.native
    
    /** Occurs when the physical display's color profile changes. */
    def oncolorprofilechanged(ev: js.Any with WinRTEvent[DisplayInformation]): Unit = js.native
    /** Occurs when the physical display's color profile changes. */
    @JSName("oncolorprofilechanged")
    var oncolorprofilechanged_Original: TypedEventHandler[DisplayInformation, _] = js.native
    
    /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
    def ondpichanged(ev: js.Any with WinRTEvent[DisplayInformation]): Unit = js.native
    /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
    @JSName("ondpichanged")
    var ondpichanged_Original: TypedEventHandler[DisplayInformation, _] = js.native
    
    /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
    def onorientationchanged(ev: js.Any with WinRTEvent[DisplayInformation]): Unit = js.native
    /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
    @JSName("onorientationchanged")
    var onorientationchanged_Original: TypedEventHandler[DisplayInformation, _] = js.native
    
    /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
    def onstereoenabledchanged(ev: js.Any with WinRTEvent[DisplayInformation]): Unit = js.native
    /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
    @JSName("onstereoenabledchanged")
    var onstereoenabledchanged_Original: TypedEventHandler[DisplayInformation, _] = js.native
    
    /** Gets the raw dots per inch (DPI) along the x axis of the display monitor. */
    var rawDpiX: Double = js.native
    
    /** Gets the raw dots per inch (DPI) along the y axis of the display monitor. */
    var rawDpiY: Double = js.native
    
    /** Gets a value representing the number of raw (physical) pixels for each view (layout) pixel. */
    var rawPixelsPerViewPixel: Double = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_colorprofilechanged(`type`: colorprofilechanged, listener: TypedEventHandler[DisplayInformation, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dpichanged(`type`: dpichanged, listener: TypedEventHandler[DisplayInformation, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchanged(`type`: orientationchanged, listener: TypedEventHandler[DisplayInformation, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stereoenabledchanged(`type`: stereoenabledchanged, listener: TypedEventHandler[DisplayInformation, _]): Unit = js.native
    
    /** Gets the scale factor of the immersive environment. */
    var resolutionScale: ResolutionScale = js.native
    
    /** Gets a value that indicates whether the device supports stereoscopic 3D. */
    var stereoEnabled: Boolean = js.native
  }
  
  /** Provides various properties that are related to the physical display. */
  @js.native
  trait DisplayProperties extends StObject
  
  /** Represents a method that handles display property events. */
  type DisplayPropertiesEventHandler = js.Function1[/* ev */ WinRTEvent[js.Any], Unit]
}
