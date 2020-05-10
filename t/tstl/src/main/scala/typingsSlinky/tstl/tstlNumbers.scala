package typingsSlinky.tstl

import typingsSlinky.tstl.accessTypeMod.AccessType
import typingsSlinky.tstl.colorMod.Color
import typingsSlinky.tstl.lockTypeMod.LockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tstlNumbers {
  @js.native
  sealed trait `0`
    extends AccessType
       with Color
       with LockType
  
  @js.native
  sealed trait `1`
    extends AccessType
       with Color
       with LockType
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
}

