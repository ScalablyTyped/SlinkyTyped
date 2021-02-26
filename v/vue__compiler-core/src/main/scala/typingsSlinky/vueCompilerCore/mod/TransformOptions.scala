package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.babelParser.mod.ParserPlugin
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformOptions extends StObject {
  
  /**
    * Optional binding metadata analyzed from script - used to optimize
    * binding access when `prefixIdentifiers` is enabled.
    */
  var bindingMetadata: js.UndefOr[BindingMetadata] = js.native
  
  /**
    * Cache v-on handlers to avoid creating new inline functions on each render,
    * also avoids the need for dynamically patching the handlers by wrapping it.
    * e.g `@click="foo"` by default is compiled to `{ onClick: foo }`. With this
    * option it's compiled to:
    * ```js
    * { onClick: _cache[0] || (_cache[0] = e => _ctx.foo(e)) }
    * ```
    * - Requires "prefixIdentifiers" to be enabled because it relies on scope
    * analysis to determine if a handler is safe to cache.
    * @default false
    */
  var cacheHandlers: js.UndefOr[Boolean] = js.native
  
  /**
    * An object of { name: transform } to be applied to every directive attribute
    * node found on element nodes.
    */
  var directiveTransforms: js.UndefOr[Record[String, js.UndefOr[DirectiveTransform]]] = js.native
  
  /**
    * A list of parser plugins to enable for `@babel/parser`, which is used to
    * parse expressions in bindings and interpolations.
    * https://babeljs.io/docs/en/next/babel-parser#plugins
    */
  var expressionPlugins: js.UndefOr[js.Array[ParserPlugin]] = js.native
  
  /**
    * Hoist static VNodes and props objects to `_hoisted_x` constants
    * @default false
    */
  var hoistStatic: js.UndefOr[Boolean] = js.native
  
  /**
    * If the pairing runtime provides additional built-in elements, use this to
    * mark them as built-in so the compiler will generate component vnodes
    * for them.
    */
  var isBuiltInComponent: js.UndefOr[js.Function1[/* tag */ String, js.Symbol | Unit]] = js.native
  
  /**
    * Used by some transforms that expects only native elements
    */
  var isCustomElement: js.UndefOr[js.Function1[/* tag */ String, Boolean | Unit]] = js.native
  
  /**
    * An array of node transforms to be applied to every AST node.
    */
  var nodeTransforms: js.UndefOr[js.Array[NodeTransform]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ CompilerError, Unit]] = js.native
  
  /**
    * Transform expressions like {{ foo }} to `_ctx.foo`.
    * If this option is false, the generated code will be wrapped in a
    * `with (this) { ... }` block.
    * - This is force-enabled in module mode, since modules are by default strict
    * and cannot use `with`
    * @default mode === 'module'
    */
  var prefixIdentifiers: js.UndefOr[Boolean] = js.native
  
  /**
    * SFC scoped styles ID
    */
  var scopeId: js.UndefOr[String | Null] = js.native
  
  /**
    * Generate SSR-optimized render functions instead.
    * The resulting function must be attached to the component via the
    * `ssrRender` option instead of `render`.
    */
  var ssr: js.UndefOr[Boolean] = js.native
  
  /**
    * SFC `<style vars>` injection string
    * needed to render inline CSS variables on component root
    */
  var ssrCssVars: js.UndefOr[String] = js.native
  
  /**
    * An optional hook to transform a node being hoisted.
    * used by compiler-dom to turn hoisted nodes into stringified HTML vnodes.
    * @default null
    */
  var transformHoist: js.UndefOr[HoistTransform | Null] = js.native
}
object TransformOptions {
  
  @scala.inline
  def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  
  @scala.inline
  implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingMetadata(value: BindingMetadata): Self = StObject.set(x, "bindingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingMetadataUndefined: Self = StObject.set(x, "bindingMetadata", js.undefined)
    
    @scala.inline
    def setCacheHandlers(value: Boolean): Self = StObject.set(x, "cacheHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheHandlersUndefined: Self = StObject.set(x, "cacheHandlers", js.undefined)
    
    @scala.inline
    def setDirectiveTransforms(value: Record[String, js.UndefOr[DirectiveTransform]]): Self = StObject.set(x, "directiveTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectiveTransformsUndefined: Self = StObject.set(x, "directiveTransforms", js.undefined)
    
    @scala.inline
    def setExpressionPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "expressionPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionPluginsUndefined: Self = StObject.set(x, "expressionPlugins", js.undefined)
    
    @scala.inline
    def setExpressionPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "expressionPlugins", js.Array(value :_*))
    
    @scala.inline
    def setHoistStatic(value: Boolean): Self = StObject.set(x, "hoistStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoistStaticUndefined: Self = StObject.set(x, "hoistStatic", js.undefined)
    
    @scala.inline
    def setIsBuiltInComponent(value: /* tag */ String => js.Symbol | Unit): Self = StObject.set(x, "isBuiltInComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsBuiltInComponentUndefined: Self = StObject.set(x, "isBuiltInComponent", js.undefined)
    
    @scala.inline
    def setIsCustomElement(value: /* tag */ String => Boolean | Unit): Self = StObject.set(x, "isCustomElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCustomElementUndefined: Self = StObject.set(x, "isCustomElement", js.undefined)
    
    @scala.inline
    def setNodeTransforms(value: js.Array[NodeTransform]): Self = StObject.set(x, "nodeTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTransformsUndefined: Self = StObject.set(x, "nodeTransforms", js.undefined)
    
    @scala.inline
    def setNodeTransformsVarargs(value: NodeTransform*): Self = StObject.set(x, "nodeTransforms", js.Array(value :_*))
    
    @scala.inline
    def setOnError(value: /* error */ CompilerError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setPrefixIdentifiers(value: Boolean): Self = StObject.set(x, "prefixIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixIdentifiersUndefined: Self = StObject.set(x, "prefixIdentifiers", js.undefined)
    
    @scala.inline
    def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeIdNull: Self = StObject.set(x, "scopeId", null)
    
    @scala.inline
    def setScopeIdUndefined: Self = StObject.set(x, "scopeId", js.undefined)
    
    @scala.inline
    def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrCssVars(value: String): Self = StObject.set(x, "ssrCssVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrCssVarsUndefined: Self = StObject.set(x, "ssrCssVars", js.undefined)
    
    @scala.inline
    def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    
    @scala.inline
    def setTransformHoist(
      value: (/* children */ js.Array[TemplateChildNode], /* context */ TransformContext, /* parent */ ParentNode2) => Unit
    ): Self = StObject.set(x, "transformHoist", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTransformHoistNull: Self = StObject.set(x, "transformHoist", null)
    
    @scala.inline
    def setTransformHoistUndefined: Self = StObject.set(x, "transformHoist", js.undefined)
  }
}
