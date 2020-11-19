package typingsSlinky.yaml.typesMod

import typingsSlinky.std.Map
import typingsSlinky.yaml.typesMod.AST.NodeToJsonContext
import typingsSlinky.yaml.typesMod.Schema.StringifyContext
import typingsSlinky.yaml.utilMod.Type.FLOW_MAP
import typingsSlinky.yaml.utilMod.Type.MAP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/types", "YAMLMap")
@js.native
class YAMLMap () extends Collection {
  
  def hasAllNullValues(): Boolean = js.native
  
  @JSName("items")
  var items_YAMLMap: js.Array[Pair] = js.native
  
  def toJSON(arg: js.UndefOr[scala.Nothing], ctx: NodeToJsonContext): js.Object | (Map[_, _]) = js.native
  def toJSON(arg: js.Any, ctx: NodeToJsonContext): js.Object | (Map[_, _]) = js.native
  
  def toString(
    ctx: js.UndefOr[scala.Nothing],
    onComment: js.UndefOr[scala.Nothing],
    onChompKeep: js.Function0[Unit]
  ): String = js.native
  def toString(ctx: js.UndefOr[scala.Nothing], onComment: js.Function0[Unit]): String = js.native
  def toString(ctx: js.UndefOr[scala.Nothing], onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext): String = js.native
  def toString(ctx: StringifyContext, onComment: js.UndefOr[scala.Nothing], onChompKeep: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext, onComment: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
  
  @JSName("type")
  var type_YAMLMap: js.UndefOr[FLOW_MAP | MAP] = js.native
}
