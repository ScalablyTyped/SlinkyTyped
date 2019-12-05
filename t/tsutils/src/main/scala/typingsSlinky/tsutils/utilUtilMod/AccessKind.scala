package typingsSlinky.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccessKind extends js.Object

@JSImport("tsutils/util/util", "AccessKind")
@js.native
object AccessKind extends js.Object {
  @js.native
  sealed trait Delete extends AccessKind
  
  @js.native
  sealed trait Modification extends AccessKind
  
  @js.native
  sealed trait None extends AccessKind
  
  @js.native
  sealed trait Read extends AccessKind
  
  @js.native
  sealed trait ReadWrite extends AccessKind
  
  @js.native
  sealed trait Write extends AccessKind
  
  /* 4 */ val Delete: typingsSlinky.tsutils.utilUtilMod.AccessKind.Delete with Double = js.native
  /* 6 */ val Modification: typingsSlinky.tsutils.utilUtilMod.AccessKind.Modification with Double = js.native
  /* 0 */ val None: typingsSlinky.tsutils.utilUtilMod.AccessKind.None with Double = js.native
  /* 1 */ val Read: typingsSlinky.tsutils.utilUtilMod.AccessKind.Read with Double = js.native
  /* 3 */ val ReadWrite: typingsSlinky.tsutils.utilUtilMod.AccessKind.ReadWrite with Double = js.native
  /* 2 */ val Write: typingsSlinky.tsutils.utilUtilMod.AccessKind.Write with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessKind with Double] = js.native
}

