package typingsSlinky.scrollIntoViewIfNeeded

import typingsSlinky.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import typingsSlinky.scrollIntoViewIfNeeded.typesMod.ScrollLogicalPosition
import typingsSlinky.scrollIntoViewIfNeeded.typesMod.ScrollMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollIntoViewIfNeededStrings {
  
  @js.native
  sealed trait always extends ScrollMode
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait auto extends ScrollBehavior
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait center extends ScrollLogicalPosition
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait end extends ScrollLogicalPosition
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait `if-needed` extends ScrollMode
  @scala.inline
  def `if-needed`: `if-needed` = "if-needed".asInstanceOf[`if-needed`]
  
  @js.native
  sealed trait nearest extends ScrollLogicalPosition
  @scala.inline
  def nearest: nearest = "nearest".asInstanceOf[nearest]
  
  @js.native
  sealed trait smooth extends ScrollBehavior
  @scala.inline
  def smooth: smooth = "smooth".asInstanceOf[smooth]
  
  @js.native
  sealed trait start extends ScrollLogicalPosition
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}
