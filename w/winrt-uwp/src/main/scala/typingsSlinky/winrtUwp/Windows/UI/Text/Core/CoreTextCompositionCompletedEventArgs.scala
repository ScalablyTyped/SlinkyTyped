package typingsSlinky.winrtUwp.Windows.UI.Text.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the CompositionCompleted event. */
@js.native
trait CoreTextCompositionCompletedEventArgs extends StObject {
  
  /** Gets a collection of CoreTextCompositionSegment objects representing the segments in the composition string. Applications can use this property, for example, to get the pre-conversion string for each composition segment. */
  var compositionSegments: IVectorView[CoreTextCompositionSegment] = js.native
  
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
  
  /** Gets a value that indicates whether the operation is canceled. */
  var isCanceled: Boolean = js.native
}
object CoreTextCompositionCompletedEventArgs {
  
  @scala.inline
  def apply(
    compositionSegments: IVectorView[CoreTextCompositionSegment],
    getDeferral: () => Deferral,
    isCanceled: Boolean
  ): CoreTextCompositionCompletedEventArgs = {
    val __obj = js.Dynamic.literal(compositionSegments = compositionSegments.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextCompositionCompletedEventArgs]
  }
  
  @scala.inline
  implicit class CoreTextCompositionCompletedEventArgsMutableBuilder[Self <: CoreTextCompositionCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompositionSegments(value: IVectorView[CoreTextCompositionSegment]): Self = StObject.set(x, "compositionSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
  }
}
