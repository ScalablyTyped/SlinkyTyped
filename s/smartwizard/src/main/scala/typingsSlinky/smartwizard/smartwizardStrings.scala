package typingsSlinky.smartwizard

import typingsSlinky.smartwizard.JQuerySmartwizard.ToolbarButtonPosition
import typingsSlinky.smartwizard.JQuerySmartwizard.ToolbarPosition
import typingsSlinky.smartwizard.JQuerySmartwizard.TransitionEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smartwizardStrings {
  
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def fade: fade = "fade".asInstanceOf[fade]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def slide: slide = "slide".asInstanceOf[slide]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait both extends ToolbarPosition
  
  @js.native
  sealed trait bottom extends ToolbarPosition
  
  @js.native
  sealed trait fade extends TransitionEffect
  
  @js.native
  sealed trait left extends ToolbarButtonPosition
  
  @js.native
  sealed trait none
    extends ToolbarPosition
       with TransitionEffect
  
  @js.native
  sealed trait right extends ToolbarButtonPosition
  
  @js.native
  sealed trait slide extends TransitionEffect
  
  @js.native
  sealed trait top extends ToolbarPosition
}
