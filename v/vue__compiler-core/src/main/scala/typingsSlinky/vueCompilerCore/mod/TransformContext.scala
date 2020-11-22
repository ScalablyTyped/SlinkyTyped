package typingsSlinky.vueCompilerCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babelParser.mod.ParserPlugin
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import typingsSlinky.vueCompilerCore.anon.VFor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<@vue/compiler-core.@vue/compiler-core.TransformOptions> */
@js.native
trait TransformContext extends js.Object {
  
  def addIdentifiers(exp: String): Unit = js.native
  def addIdentifiers(exp: ExpressionNode): Unit = js.native
  
  var bindingMetadata: BindingMetadata = js.native
  
  def cache(exp: ArrayExpression): CacheExpression | ArrayExpression = js.native
  def cache(exp: ArrayExpression, isVNode: Boolean): CacheExpression | ArrayExpression = js.native
  def cache(exp: AssignmentExpression): CacheExpression | AssignmentExpression = js.native
  def cache(exp: AssignmentExpression, isVNode: Boolean): CacheExpression | AssignmentExpression = js.native
  def cache(exp: CacheExpression): CacheExpression = js.native
  def cache(exp: CacheExpression, isVNode: Boolean): CacheExpression = js.native
  def cache(exp: CallExpression): CacheExpression | CallExpression = js.native
  def cache(exp: CallExpression, isVNode: Boolean): CacheExpression | CallExpression = js.native
  def cache(exp: CompoundExpressionNode): CacheExpression | CompoundExpressionNode = js.native
  def cache(exp: CompoundExpressionNode, isVNode: Boolean): CacheExpression | CompoundExpressionNode = js.native
  def cache(exp: ConditionalExpression): CacheExpression | ConditionalExpression = js.native
  def cache(exp: ConditionalExpression, isVNode: Boolean): CacheExpression | ConditionalExpression = js.native
  def cache(exp: FunctionExpression): CacheExpression | FunctionExpression = js.native
  def cache(exp: FunctionExpression, isVNode: Boolean): CacheExpression | FunctionExpression = js.native
  def cache(exp: ObjectExpression): CacheExpression | ObjectExpression = js.native
  def cache(exp: ObjectExpression, isVNode: Boolean): CacheExpression | ObjectExpression = js.native
  def cache(exp: SequenceExpression): CacheExpression | SequenceExpression = js.native
  def cache(exp: SequenceExpression, isVNode: Boolean): CacheExpression | SequenceExpression = js.native
  def cache(exp: SimpleExpressionNode): CacheExpression | SimpleExpressionNode = js.native
  def cache(exp: SimpleExpressionNode, isVNode: Boolean): CacheExpression | SimpleExpressionNode = js.native
  def cache(exp: VNodeCall): CacheExpression | VNodeCall = js.native
  def cache(exp: VNodeCall, isVNode: Boolean): CacheExpression | VNodeCall = js.native
  
  var cacheHandlers: Boolean = js.native
  
  var cached: Double = js.native
  
  var childIndex: Double = js.native
  
  var components: Set[String] = js.native
  
  var currentNode: RootNode | TemplateChildNode | Null = js.native
  
  var directiveTransforms: Record[String, js.UndefOr[DirectiveTransform]] = js.native
  
  var directives: Set[String] = js.native
  
  var expressionPlugins: js.Array[ParserPlugin] = js.native
  
  def helper[T /* <: js.Symbol */](name: T): T = js.native
  
  def helperString(name: js.Symbol): String = js.native
  
  var helpers: Set[js.Symbol] = js.native
  
  def hoist(exp: JSChildNode): SimpleExpressionNode = js.native
  
  var hoistStatic: Boolean = js.native
  
  var hoists: js.Array[JSChildNode | Null] = js.native
  
  var identifiers: StringDictionary[js.UndefOr[Double]] = js.native
  
  var imports: Set[ImportItem] = js.native
  
  def isBuiltInComponent(tag: String): js.Symbol | Unit = js.native
  @JSName("isBuiltInComponent")
  var isBuiltInComponent_Original: js.Function1[/* tag */ String, js.Symbol | Unit] = js.native
  
  def isCustomElement(tag: String): Boolean | Unit = js.native
  @JSName("isCustomElement")
  var isCustomElement_Original: js.Function1[/* tag */ String, Boolean | Unit] = js.native
  
  var nodeTransforms: js.Array[NodeTransform] = js.native
  
  def onError(error: CompilerError): Unit = js.native
  @JSName("onError")
  var onError_Original: js.Function1[/* error */ CompilerError, Unit] = js.native
  
  def onNodeRemoved(): Unit = js.native
  
  var parent: ParentNode2 | Null = js.native
  
  var prefixIdentifiers: Boolean = js.native
  
  def removeIdentifiers(exp: String): Unit = js.native
  def removeIdentifiers(exp: ExpressionNode): Unit = js.native
  
  def removeNode(): Unit = js.native
  def removeNode(node: TemplateChildNode): Unit = js.native
  
  def replaceNode(node: TemplateChildNode): Unit = js.native
  
  var root: RootNode = js.native
  
  var scopeId: String = js.native
  
  var scopes: VFor = js.native
  
  var ssr: Boolean = js.native
  
  var ssrCssVars: String = js.native
  
  var temps: Double = js.native
  
  def transformHoist(children: js.Array[TemplateChildNode], context: TransformContext, parent: ParentNode2): Unit = js.native
  @JSName("transformHoist")
  var transformHoist_Original: HoistTransform = js.native
}
