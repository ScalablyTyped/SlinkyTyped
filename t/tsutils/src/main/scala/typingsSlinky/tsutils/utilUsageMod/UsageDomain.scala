package typingsSlinky.tsutils.utilUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UsageDomain extends js.Object

@JSImport("tsutils/util/usage", "UsageDomain")
@js.native
object UsageDomain extends js.Object {
  @js.native
  sealed trait Any extends UsageDomain
  
  @js.native
  sealed trait Namespace extends UsageDomain
  
  @js.native
  sealed trait Type extends UsageDomain
  
  @js.native
  sealed trait TypeQuery extends UsageDomain
  
  @js.native
  sealed trait Value extends UsageDomain
  
  @js.native
  sealed trait ValueOrNamespace extends UsageDomain
  
  /* 7 */ val Any: typingsSlinky.tsutils.utilUsageMod.UsageDomain.Any with Double = js.native
  /* 1 */ val Namespace: typingsSlinky.tsutils.utilUsageMod.UsageDomain.Namespace with Double = js.native
  /* 2 */ val Type: typingsSlinky.tsutils.utilUsageMod.UsageDomain.Type with Double = js.native
  /* 8 */ val TypeQuery: typingsSlinky.tsutils.utilUsageMod.UsageDomain.TypeQuery with Double = js.native
  /* 4 */ val Value: typingsSlinky.tsutils.utilUsageMod.UsageDomain.Value with Double = js.native
  /* 5 */ val ValueOrNamespace: typingsSlinky.tsutils.utilUsageMod.UsageDomain.ValueOrNamespace with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UsageDomain with Double] = js.native
}

