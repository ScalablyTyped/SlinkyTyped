package typingsSlinky.winrt.global.Windows.Graphics

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Graphics.Display.DisplayOrientations
import typingsSlinky.winrt.Windows.Graphics.Display.ResolutionScale
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Display")
@js.native
object Display extends js.Object {
  
  @js.native
  object DisplayOrientations extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Display.DisplayOrientations with Double] = js.native
    
    /* 1 */ val landscape: typingsSlinky.winrt.Windows.Graphics.Display.DisplayOrientations.landscape with Double = js.native
    
    /* 3 */ val landscapeFlipped: typingsSlinky.winrt.Windows.Graphics.Display.DisplayOrientations.landscapeFlipped with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Graphics.Display.DisplayOrientations.none with Double = js.native
    
    /* 2 */ val portrait: typingsSlinky.winrt.Windows.Graphics.Display.DisplayOrientations.portrait with Double = js.native
    
    /* 4 */ val portraitFlipped: typingsSlinky.winrt.Windows.Graphics.Display.DisplayOrientations.portraitFlipped with Double = js.native
  }
  
  @js.native
  class DisplayProperties ()
    extends typingsSlinky.winrt.Windows.Graphics.Display.DisplayProperties
  /* static members */
  @js.native
  object DisplayProperties extends js.Object {
    
    var autoRotationPreferences: DisplayOrientations = js.native
    
    var currentOrientation: DisplayOrientations = js.native
    
    def getColorProfileAsync(): IAsyncOperation[IRandomAccessStream] = js.native
    
    var logicalDpi: Double = js.native
    
    var nativeOrientation: DisplayOrientations = js.native
    
    var oncolorprofilechanged: js.Any = js.native
    
    var ondisplaycontentsinvalidated: js.Any = js.native
    
    var onlogicaldpichanged: js.Any = js.native
    
    var onorientationchanged: js.Any = js.native
    
    var onstereoenabledchanged: js.Any = js.native
    
    var resolutionScale: ResolutionScale = js.native
    
    var stereoEnabled: Boolean = js.native
  }
  
  @js.native
  object ResolutionScale extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Display.ResolutionScale with Double] = js.native
    
    /* 0 */ val invalid: typingsSlinky.winrt.Windows.Graphics.Display.ResolutionScale.invalid with Double = js.native
    
    /* 1 */ val scale100Percent: typingsSlinky.winrt.Windows.Graphics.Display.ResolutionScale.scale100Percent with Double = js.native
    
    /* 2 */ val scale140Percent: typingsSlinky.winrt.Windows.Graphics.Display.ResolutionScale.scale140Percent with Double = js.native
    
    /* 3 */ val scale180Percent: typingsSlinky.winrt.Windows.Graphics.Display.ResolutionScale.scale180Percent with Double = js.native
  }
}
