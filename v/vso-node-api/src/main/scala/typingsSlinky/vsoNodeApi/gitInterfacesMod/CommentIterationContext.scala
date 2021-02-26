package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentIterationContext extends StObject {
  
  /**
    * The iteration of the file on the left side of the diff when the thread was created. If this value is equal to SecondComparingIteration, then this version is the common commit between the source and target branches of the pull request.
    */
  var firstComparingIteration: Double = js.native
  
  /**
    * The iteration of the file on the right side of the diff when the thread was created.
    */
  var secondComparingIteration: Double = js.native
}
object CommentIterationContext {
  
  @scala.inline
  def apply(firstComparingIteration: Double, secondComparingIteration: Double): CommentIterationContext = {
    val __obj = js.Dynamic.literal(firstComparingIteration = firstComparingIteration.asInstanceOf[js.Any], secondComparingIteration = secondComparingIteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentIterationContext]
  }
  
  @scala.inline
  implicit class CommentIterationContextMutableBuilder[Self <: CommentIterationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstComparingIteration(value: Double): Self = StObject.set(x, "firstComparingIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondComparingIteration(value: Double): Self = StObject.set(x, "secondComparingIteration", value.asInstanceOf[js.Any])
  }
}
