package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmNumbers.`15`
import typingsSlinky.xrm.xrmNumbers.`16`
import typingsSlinky.xrm.xrmNumbers.`1`
import typingsSlinky.xrm.xrmNumbers.`2`
import typingsSlinky.xrm.xrmNumbers.`47`
import typingsSlinky.xrm.xrmNumbers.`58`
import typingsSlinky.xrm.xrmNumbers.`59`
import typingsSlinky.xrm.xrmNumbers.`5`
import typingsSlinky.xrm.xrmNumbers.`6`
import typingsSlinky.xrm.xrmNumbers.`70`
import typingsSlinky.xrm.xrmNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enumeration of entity form save modes.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmNumbers.`1`
  - typingsSlinky.xrm.xrmNumbers.`2`
  - typingsSlinky.xrm.xrmNumbers.`59`
  - typingsSlinky.xrm.xrmNumbers.`70`
  - typingsSlinky.xrm.xrmNumbers.`58`
  - typingsSlinky.xrm.xrmNumbers.`5`
  - typingsSlinky.xrm.xrmNumbers.`6`
  - typingsSlinky.xrm.xrmNumbers.`47`
  - typingsSlinky.xrm.xrmNumbers.`7`
  - typingsSlinky.xrm.xrmNumbers.`16`
  - typingsSlinky.xrm.xrmNumbers.`15`
*/
trait SaveMode extends js.Object

object SaveMode {
  @scala.inline
  def Assign: `47` = this.cast(47)
  @scala.inline
  def AutoSave: `70` = this.cast(70)
  @scala.inline
  def Deactivate: `5` = this.cast(5)
  @scala.inline
  def Disqualify: `15` = this.cast(15)
  @scala.inline
  def Qualify: `16` = this.cast(16)
  @scala.inline
  def Reactivate: `6` = this.cast(6)
  @scala.inline
  def Save: `1` = this.cast(1)
  @scala.inline
  def SaveAndClose: `2` = this.cast(2)
  @scala.inline
  def SaveAndNew: `59` = this.cast(59)
  @scala.inline
  def SaveAsCompleted: `58` = this.cast(58)
  @scala.inline
  def Send: `7` = this.cast(7)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

