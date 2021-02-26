package typingsSlinky.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VariableDeclarationKind extends StObject
@JSImport("tsutils/util/util", "VariableDeclarationKind")
@js.native
object VariableDeclarationKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableDeclarationKind with Double] = js.native
  
  @js.native
  sealed trait Const extends VariableDeclarationKind
  /* 2 */ val Const: typingsSlinky.tsutils.utilUtilMod.VariableDeclarationKind.Const with Double = js.native
  
  @js.native
  sealed trait Let extends VariableDeclarationKind
  /* 1 */ val Let: typingsSlinky.tsutils.utilUtilMod.VariableDeclarationKind.Let with Double = js.native
  
  @js.native
  sealed trait Var extends VariableDeclarationKind
  /* 0 */ val Var: typingsSlinky.tsutils.utilUtilMod.VariableDeclarationKind.Var with Double = js.native
}
