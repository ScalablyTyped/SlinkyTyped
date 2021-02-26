package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractRange extends StObject {
  
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  val collapsed: scala.Boolean = js.native
  
  /**
    * Returns range's end node.
    */
  val endContainer: org.scalajs.dom.raw.Node = js.native
  
  /**
    * Returns range's end offset.
    */
  val endOffset: Double = js.native
  
  /**
    * Returns range's start node.
    */
  val startContainer: org.scalajs.dom.raw.Node = js.native
  
  /**
    * Returns range's start offset.
    */
  val startOffset: Double = js.native
}
object AbstractRange {
  
  @scala.inline
  def apply(
    collapsed: scala.Boolean,
    endContainer: org.scalajs.dom.raw.Node,
    endOffset: Double,
    startContainer: org.scalajs.dom.raw.Node,
    startOffset: Double
  ): AbstractRange = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractRange]
  }
  
  @scala.inline
  implicit class AbstractRangeMutableBuilder[Self <: AbstractRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: scala.Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndContainer(value: org.scalajs.dom.raw.Node): Self = StObject.set(x, "endContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartContainer(value: org.scalajs.dom.raw.Node): Self = StObject.set(x, "startContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
