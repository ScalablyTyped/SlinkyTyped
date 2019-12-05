package typingsSlinky.webpackDashChain.webpackDashChainMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.webpackMod.Condition
import typingsSlinky.webpackDashChain.webpackDashChainStrings.`javascript/auto`
import typingsSlinky.webpackDashChain.webpackDashChainStrings.`javascript/dynamic`
import typingsSlinky.webpackDashChain.webpackDashChainStrings.`javascript/esm`
import typingsSlinky.webpackDashChain.webpackDashChainStrings.`webassembly/experimental`
import typingsSlinky.webpackDashChain.webpackDashChainStrings.json
import typingsSlinky.webpackDashChain.webpackDashChainStrings.post
import typingsSlinky.webpackDashChain.webpackDashChainStrings.pre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Rule")
@js.native
class Rule ()
  extends typingsSlinky.webpackDashChain.webpackDashChainMod.__Config.TypedChainedMap[Module, js.Any] {
  var exclude: TypedChainedSet[this.type, Condition] = js.native
  var include: TypedChainedSet[this.type, Condition] = js.native
  var oneOfs: TypedChainedMap[this.type, OneOf] = js.native
  var uses: TypedChainedMap[this.type, Use[Rule]] = js.native
  /* CompleteClass */
  override def end(): Module = js.native
  @JSName("enforce")
  def enforce_post(value: post): this.type = js.native
  @JSName("enforce")
  def enforce_pre(value: pre): this.type = js.native
  def oneOf(name: String): OneOf = js.native
  def parser(value: StringDictionary[js.Any]): this.type = js.native
  def post(): this.type = js.native
  def pre(): this.type = js.native
  def test(value: js.Array[Condition]): this.type = js.native
  def test(value: Condition): this.type = js.native
  @JSName("type")
  def type_javascriptauto(value: `javascript/auto`): this.type = js.native
  @JSName("type")
  def type_javascriptdynamic(value: `javascript/dynamic`): this.type = js.native
  @JSName("type")
  def type_javascriptesm(value: `javascript/esm`): this.type = js.native
  @JSName("type")
  def type_json(value: json): this.type = js.native
  @JSName("type")
  def type_webassemblyexperimental(value: `webassembly/experimental`): this.type = js.native
  def use(name: String): Use[Rule] = js.native
}

