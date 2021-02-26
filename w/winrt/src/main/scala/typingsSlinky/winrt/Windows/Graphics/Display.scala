package typingsSlinky.winrt.Windows.Graphics

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  @js.native
  sealed trait DisplayOrientations extends StObject
  @JSGlobal("Windows.Graphics.Display.DisplayOrientations")
  @js.native
  object DisplayOrientations extends StObject {
    
    @js.native
    sealed trait landscape extends DisplayOrientations
    
    @js.native
    sealed trait landscapeFlipped extends DisplayOrientations
    
    @js.native
    sealed trait none extends DisplayOrientations
    
    @js.native
    sealed trait portrait extends DisplayOrientations
    
    @js.native
    sealed trait portraitFlipped extends DisplayOrientations
  }
  
  @js.native
  sealed trait ResolutionScale extends StObject
  @JSGlobal("Windows.Graphics.Display.ResolutionScale")
  @js.native
  object ResolutionScale extends StObject {
    
    @js.native
    sealed trait invalid extends ResolutionScale
    
    @js.native
    sealed trait scale100Percent extends ResolutionScale
    
    @js.native
    sealed trait scale140Percent extends ResolutionScale
    
    @js.native
    sealed trait scale180Percent extends ResolutionScale
  }
  
  @js.native
  trait DisplayProperties extends StObject
  
  type DisplayPropertiesEventHandler = js.Function1[/* sender */ js.Any, Unit]
  
  @js.native
  trait IDisplayPropertiesStatics extends StObject {
    
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
  object IDisplayPropertiesStatics {
    
    @scala.inline
    def apply(
      autoRotationPreferences: DisplayOrientations,
      currentOrientation: DisplayOrientations,
      getColorProfileAsync: () => IAsyncOperation[IRandomAccessStream],
      logicalDpi: Double,
      nativeOrientation: DisplayOrientations,
      oncolorprofilechanged: js.Any,
      ondisplaycontentsinvalidated: js.Any,
      onlogicaldpichanged: js.Any,
      onorientationchanged: js.Any,
      onstereoenabledchanged: js.Any,
      resolutionScale: ResolutionScale,
      stereoEnabled: Boolean
    ): IDisplayPropertiesStatics = {
      val __obj = js.Dynamic.literal(autoRotationPreferences = autoRotationPreferences.asInstanceOf[js.Any], currentOrientation = currentOrientation.asInstanceOf[js.Any], getColorProfileAsync = js.Any.fromFunction0(getColorProfileAsync), logicalDpi = logicalDpi.asInstanceOf[js.Any], nativeOrientation = nativeOrientation.asInstanceOf[js.Any], oncolorprofilechanged = oncolorprofilechanged.asInstanceOf[js.Any], ondisplaycontentsinvalidated = ondisplaycontentsinvalidated.asInstanceOf[js.Any], onlogicaldpichanged = onlogicaldpichanged.asInstanceOf[js.Any], onorientationchanged = onorientationchanged.asInstanceOf[js.Any], onstereoenabledchanged = onstereoenabledchanged.asInstanceOf[js.Any], resolutionScale = resolutionScale.asInstanceOf[js.Any], stereoEnabled = stereoEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDisplayPropertiesStatics]
    }
    
    @scala.inline
    implicit class IDisplayPropertiesStaticsMutableBuilder[Self <: IDisplayPropertiesStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRotationPreferences(value: DisplayOrientations): Self = StObject.set(x, "autoRotationPreferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentOrientation(value: DisplayOrientations): Self = StObject.set(x, "currentOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetColorProfileAsync(value: () => IAsyncOperation[IRandomAccessStream]): Self = StObject.set(x, "getColorProfileAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLogicalDpi(value: Double): Self = StObject.set(x, "logicalDpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeOrientation(value: DisplayOrientations): Self = StObject.set(x, "nativeOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncolorprofilechanged(value: js.Any): Self = StObject.set(x, "oncolorprofilechanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndisplaycontentsinvalidated(value: js.Any): Self = StObject.set(x, "ondisplaycontentsinvalidated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlogicaldpichanged(value: js.Any): Self = StObject.set(x, "onlogicaldpichanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnorientationchanged(value: js.Any): Self = StObject.set(x, "onorientationchanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnstereoenabledchanged(value: js.Any): Self = StObject.set(x, "onstereoenabledchanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionScale(value: ResolutionScale): Self = StObject.set(x, "resolutionScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStereoEnabled(value: Boolean): Self = StObject.set(x, "stereoEnabled", value.asInstanceOf[js.Any])
    }
  }
}
