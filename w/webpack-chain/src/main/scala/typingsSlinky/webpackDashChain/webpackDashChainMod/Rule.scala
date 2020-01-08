package typingsSlinky.webpackDashChain.webpackDashChainMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.webpackMod.Condition
import typingsSlinky.webpackDashChain.webpackDashChainStrings.javascriptSlashauto
import typingsSlinky.webpackDashChain.webpackDashChainStrings.javascriptSlashdynamic
import typingsSlinky.webpackDashChain.webpackDashChainStrings.javascriptSlashesm
import typingsSlinky.webpackDashChain.webpackDashChainStrings.json
import typingsSlinky.webpackDashChain.webpackDashChainStrings.post
import typingsSlinky.webpackDashChain.webpackDashChainStrings.pre
import typingsSlinky.webpackDashChain.webpackDashChainStrings.webassemblySlashexperimental
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Rule")
@js.native
class Rule[T] ()
  extends typingsSlinky.webpackDashChain.webpackDashChainMod.__Config.TypedChainedMap[T, js.Any]
     with Orderable {
  var exclude: TypedChainedSet[this.type, Condition] = js.native
  var include: TypedChainedSet[this.type, Condition] = js.native
  var oneOfs: TypedChainedMap[this.type, Rule[Rule[Module]]] = js.native
  var rules: TypedChainedMap[this.type, Rule[Rule[Module]]] = js.native
  var uses: TypedChainedMap[this.type, Use[Rule[Module]]] = js.native
  /* CompleteClass */
  override def after(name: String): this.type = js.native
  /* CompleteClass */
  override def before(name: String): this.type = js.native
  /* CompleteClass */
  override def end(): T = js.native
  @JSName("enforce")
  def enforce_post(value: post): this.type = js.native
  @JSName("enforce")
  def enforce_pre(value: pre): this.type = js.native
  def oneOf(name: String): Rule[Rule[Module]] = js.native
  def parser(value: StringDictionary[js.Any]): this.type = js.native
  def post(): this.type = js.native
  def pre(): this.type = js.native
  def resourceQuery(value: js.Array[Condition]): this.type = js.native
  def resourceQuery(value: Condition): this.type = js.native
  def rule(name: String): Rule[Rule[Module]] = js.native
  def test(value: js.Array[Condition]): this.type = js.native
  def test(value: Condition): this.type = js.native
  @JSName("type")
  def type_javascriptauto(value: javascriptSlashauto): this.type = js.native
  @JSName("type")
  def type_javascriptdynamic(value: javascriptSlashdynamic): this.type = js.native
  @JSName("type")
  def type_javascriptesm(value: javascriptSlashesm): this.type = js.native
  @JSName("type")
  def type_json(value: json): this.type = js.native
  @JSName("type")
  def type_webassemblyexperimental(value: webassemblySlashexperimental): this.type = js.native
  def use(name: String): Use[this.type] = js.native
}

