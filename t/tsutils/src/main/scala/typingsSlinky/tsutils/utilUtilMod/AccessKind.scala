package typingsSlinky.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccessKind extends StObject
@JSImport("tsutils/util/util", "AccessKind")
@js.native
object AccessKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessKind with Double] = js.native
  
  @js.native
  sealed trait Delete extends AccessKind
  /* 4 */ val Delete: typingsSlinky.tsutils.utilUtilMod.AccessKind.Delete with Double = js.native
  
  @js.native
  sealed trait Modification extends AccessKind
  /* 6 */ val Modification: typingsSlinky.tsutils.utilUtilMod.AccessKind.Modification with Double = js.native
  
  @js.native
  sealed trait None extends AccessKind
  /* 0 */ val None: typingsSlinky.tsutils.utilUtilMod.AccessKind.None with Double = js.native
  
  @js.native
  sealed trait Read extends AccessKind
  /* 1 */ val Read: typingsSlinky.tsutils.utilUtilMod.AccessKind.Read with Double = js.native
  
  @js.native
  sealed trait ReadWrite extends AccessKind
  /* 3 */ val ReadWrite: typingsSlinky.tsutils.utilUtilMod.AccessKind.ReadWrite with Double = js.native
  
  @js.native
  sealed trait Write extends AccessKind
  /* 2 */ val Write: typingsSlinky.tsutils.utilUtilMod.AccessKind.Write with Double = js.native
}
