package typingsSlinky.winrtUwp.global.Windows.Graphics

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayPropertiesEventHandler
import typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.colorprofilechanged
import typingsSlinky.winrtUwp.winrtUwpStrings.displaycontentsinvalidated
import typingsSlinky.winrtUwp.winrtUwpStrings.logicaldpichanged
import typingsSlinky.winrtUwp.winrtUwpStrings.orientationchanged
import typingsSlinky.winrtUwp.winrtUwpStrings.stereoenabledchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains components to determine aspects of a physical display. */
@JSGlobal("Windows.Graphics.Display")
@js.native
object Display extends js.Object {
  /** Monitors and controls physical display information. The class provides events to allow clients to monitor for changes in the display. */
  @js.native
  abstract class DisplayInformation ()
    extends typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayInformation
  
  /** Provides various properties that are related to the physical display. */
  @js.native
  abstract class DisplayProperties ()
    extends typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayProperties
  
  /* static members */
  @js.native
  object DisplayInformation extends js.Object {
    /** Gets and sets the preferred orientation of the app. */
    var autoRotationPreferences: DisplayOrientations = js.native
    /** Occurs when the display requires redrawing. */
    @JSName("ondisplaycontentsinvalidated")
    var ondisplaycontentsinvalidated_Original: TypedEventHandler[typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayInformation, _] = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_displaycontentsinvalidated(
      `type`: displaycontentsinvalidated,
      listener: TypedEventHandler[typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayInformation, _]
    ): Unit = js.native
    /**
      * Gets the current physical display information.
      * @return A DisplayInformation object that contains the current physical display information.
      */
    def getForCurrentView(): typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayInformation = js.native
    /** Occurs when the display requires redrawing. */
    def ondisplaycontentsinvalidated(ev: js.Any with WinRTEvent[typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayInformation]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_displaycontentsinvalidated(
      `type`: displaycontentsinvalidated,
      listener: TypedEventHandler[typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayInformation, _]
    ): Unit = js.native
  }
  
  /** Describes the orientation of a rectangular monitor. */
  @js.native
  object DisplayOrientations extends js.Object {
    /* 1 */ val landscape: typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayOrientations.landscape with Double = js.native
    /* 3 */ val landscapeFlipped: typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayOrientations.landscapeFlipped with Double = js.native
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayOrientations.none with Double = js.native
    /* 2 */ val portrait: typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayOrientations.portrait with Double = js.native
    /* 4 */ val portraitFlipped: typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayOrientations.portraitFlipped with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayOrientations with Double] = js.native
  }
  
  /* static members */
  @js.native
  object DisplayProperties extends js.Object {
    /** Gets and sets the preferred orientation of the app. */
    var autoRotationPreferences: DisplayOrientations = js.native
    /** Gets the current orientation of a rectangular monitor. */
    var currentOrientation: DisplayOrientations = js.native
    /** Gets the pixels per logical inch of the current environment. */
    var logicalDpi: Double = js.native
    /** Gets the native orientation of the display monitor, which is typically the orientation where the buttons on the device match the orientation of the monitor. */
    var nativeOrientation: DisplayOrientations = js.native
    /** Occurs when the physical display's color profile changes. */
    @JSName("oncolorprofilechanged")
    var oncolorprofilechanged_Original: DisplayPropertiesEventHandler = js.native
    /** Occurs when the display requires redrawing. */
    @JSName("ondisplaycontentsinvalidated")
    var ondisplaycontentsinvalidated_Original: DisplayPropertiesEventHandler = js.native
    /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
    @JSName("onlogicaldpichanged")
    var onlogicaldpichanged_Original: DisplayPropertiesEventHandler = js.native
    /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
    @JSName("onorientationchanged")
    var onorientationchanged_Original: DisplayPropertiesEventHandler = js.native
    /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
    @JSName("onstereoenabledchanged")
    var onstereoenabledchanged_Original: DisplayPropertiesEventHandler = js.native
    /** Gets the scale factor of the immersive environment. */
    var resolutionScale: ResolutionScale = js.native
    /** Gets a value that indicates whether the device supports stereoscopic 3D. */
    var stereoEnabled: Boolean = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_colorprofilechanged(`type`: colorprofilechanged, listener: DisplayPropertiesEventHandler): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_displaycontentsinvalidated(`type`: displaycontentsinvalidated, listener: DisplayPropertiesEventHandler): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_logicaldpichanged(`type`: logicaldpichanged, listener: DisplayPropertiesEventHandler): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchanged(`type`: orientationchanged, listener: DisplayPropertiesEventHandler): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stereoenabledchanged(`type`: stereoenabledchanged, listener: DisplayPropertiesEventHandler): Unit = js.native
    /**
      * Asynchronously gets the default International Color Consortium (ICC) color profile that is associated with the physical display.
      * @return Object that manages the asynchronous retrieval of the color profile.
      */
    def getColorProfileAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
    /** Occurs when the physical display's color profile changes. */
    def oncolorprofilechanged(ev: WinRTEvent[_]): Unit = js.native
    /** Occurs when the display requires redrawing. */
    def ondisplaycontentsinvalidated(ev: WinRTEvent[_]): Unit = js.native
    /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
    def onlogicaldpichanged(ev: WinRTEvent[_]): Unit = js.native
    /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
    def onorientationchanged(ev: WinRTEvent[_]): Unit = js.native
    /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
    def onstereoenabledchanged(ev: WinRTEvent[_]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_colorprofilechanged(`type`: colorprofilechanged, listener: DisplayPropertiesEventHandler): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_displaycontentsinvalidated(`type`: displaycontentsinvalidated, listener: DisplayPropertiesEventHandler): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_logicaldpichanged(`type`: logicaldpichanged, listener: DisplayPropertiesEventHandler): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchanged(`type`: orientationchanged, listener: DisplayPropertiesEventHandler): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stereoenabledchanged(`type`: stereoenabledchanged, listener: DisplayPropertiesEventHandler): Unit = js.native
  }
  
  /** Describes the scale factor of the immersive environment. The scale factor is determined by the operating system in response to high pixel density screens. */
  @js.native
  object ResolutionScale extends js.Object {
    /* 0 */ val invalid: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.invalid with Double = js.native
    /* 1 */ val scale100Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale100Percent with Double = js.native
    /* 2 */ val scale120Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale120Percent with Double = js.native
    /* 3 */ val scale125Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale125Percent with Double = js.native
    /* 4 */ val scale140Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale140Percent with Double = js.native
    /* 5 */ val scale150Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale150Percent with Double = js.native
    /* 6 */ val scale160Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale160Percent with Double = js.native
    /* 7 */ val scale175Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale175Percent with Double = js.native
    /* 8 */ val scale180Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale180Percent with Double = js.native
    /* 9 */ val scale200Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale200Percent with Double = js.native
    /* 10 */ val scale225Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale225Percent with Double = js.native
    /* 11 */ val scale250Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale250Percent with Double = js.native
    /* 12 */ val scale300Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale300Percent with Double = js.native
    /* 13 */ val scale350Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale350Percent with Double = js.native
    /* 14 */ val scale400Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale400Percent with Double = js.native
    /* 15 */ val scale450Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale450Percent with Double = js.native
    /* 16 */ val scale500Percent: typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale500Percent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Graphics.Display.ResolutionScale with Double] = js.native
  }
  
}

