package typingsSlinky.yaml.utilMod

import typingsSlinky.yaml.typesMod.Scalar
import typingsSlinky.yaml.typesMod.Schema.StringifyContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/util", "stringifyString")
@js.native
object stringifyString extends js.Object {
  
  def apply(item: Scalar, ctx: StringifyContext): String = js.native
  def apply(
    item: Scalar,
    ctx: StringifyContext,
    onComment: js.UndefOr[scala.Nothing],
    onChompKeep: js.Function0[Unit]
  ): String = js.native
  def apply(item: Scalar, ctx: StringifyContext, onComment: js.Function0[Unit]): String = js.native
  def apply(
    item: Scalar,
    ctx: StringifyContext,
    onComment: js.Function0[Unit],
    onChompKeep: js.Function0[Unit]
  ): String = js.native
}
