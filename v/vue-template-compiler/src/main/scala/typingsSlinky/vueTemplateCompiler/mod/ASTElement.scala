package typingsSlinky.vueTemplateCompiler.mod

import typingsSlinky.std.Record
import typingsSlinky.vueTemplateCompiler.AnonCallback
import typingsSlinky.vueTemplateCompiler.AnonName
import typingsSlinky.vueTemplateCompiler.AnonValue
import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTElement extends ASTNode {
  var alias: js.UndefOr[String] = js.native
  // weex specific
  var appendAsTree: js.UndefOr[Boolean] = js.native
  var attrs: js.UndefOr[js.Array[AnonName]] = js.native
  var attrsList: js.Array[AnonName] = js.native
  var attrsMap: Record[String, _] = js.native
  var children: js.Array[ASTNode] = js.native
  var classBinding: js.UndefOr[String] = js.native
  var component: js.UndefOr[String] = js.native
  var directives: js.UndefOr[js.Array[ASTDirective]] = js.native
  var `else`: js.UndefOr[`true`] = js.native
  var elseif: js.UndefOr[String] = js.native
  var events: js.UndefOr[ASTElementHandlers] = js.native
  var `for`: js.UndefOr[String] = js.native
  var forProcessed: js.UndefOr[Boolean] = js.native
  var forbidden: js.UndefOr[`true`] = js.native
  var hasBindings: js.UndefOr[Boolean] = js.native
  var `if`: js.UndefOr[String] = js.native
  var ifConditions: js.UndefOr[js.Array[ASTIfCondition]] = js.native
  var ifProcessed: js.UndefOr[Boolean] = js.native
  var inlineTemplate: js.UndefOr[`true`] = js.native
  var iterator1: js.UndefOr[String] = js.native
  var iterator2: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var model: js.UndefOr[AnonCallback] = js.native
  var nativeEvents: js.UndefOr[ASTElementHandlers] = js.native
  var ns: js.UndefOr[String] = js.native
  var once: js.UndefOr[`true`] = js.native
  var onceProcessed: js.UndefOr[Boolean] = js.native
  var parent: js.UndefOr[ASTElement] = js.native
  var plain: js.UndefOr[Boolean] = js.native
  var pre: js.UndefOr[`true`] = js.native
  var processed: js.UndefOr[`true`] = js.native
  var props: js.UndefOr[js.Array[AnonValue]] = js.native
  var ref: js.UndefOr[String] = js.native
  var refInFor: js.UndefOr[Boolean] = js.native
  var scopedSlots: js.UndefOr[Record[String, ASTElement]] = js.native
  var slotName: js.UndefOr[String] = js.native
  var slotScope: js.UndefOr[String] = js.native
  var slotTarget: js.UndefOr[String] = js.native
  // 2.4 ssr optimization
  var ssrOptimizability: js.UndefOr[SSROptimizability] = js.native
  var static: js.UndefOr[Boolean] = js.native
  var staticClass: js.UndefOr[String] = js.native
  var staticInFor: js.UndefOr[Boolean] = js.native
  var staticProcessed: js.UndefOr[Boolean] = js.native
  var staticRoot: js.UndefOr[Boolean] = js.native
  var staticStyle: js.UndefOr[String] = js.native
  var styleBinding: js.UndefOr[String] = js.native
  var tag: String = js.native
  var text: js.UndefOr[String] = js.native
  var transition: js.UndefOr[String | `true`] = js.native
  var transitionMode: js.UndefOr[String | Null] = js.native
  var transitionOnAppear: js.UndefOr[Boolean] = js.native
  var `type`: `1` = js.native
  var wrapData: js.UndefOr[js.Function1[/* code */ String, String]] = js.native
  var wrapListeners: js.UndefOr[js.Function1[/* code */ String, String]] = js.native
}

object ASTElement {
  @scala.inline
  def apply(
    attrsList: js.Array[AnonName],
    attrsMap: Record[String, _],
    children: js.Array[ASTNode],
    tag: String,
    `type`: `1`
  ): ASTElement = {
    val __obj = js.Dynamic.literal(attrsList = attrsList.asInstanceOf[js.Any], attrsMap = attrsMap.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTElement]
  }
  @scala.inline
  implicit class ASTElementOps[Self <: ASTElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrsList(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrsMap(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrsMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[ASTNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendAsTree(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendAsTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendAsTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendAsTree")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrs(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withClassBinding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectives(value: js.Array[ASTDirective]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(js.undefined)
        ret
    }
    @scala.inline
    def withElse(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("else")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("else")(js.undefined)
        ret
    }
    @scala.inline
    def withElseif(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elseif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElseif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elseif")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: ASTElementHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(js.undefined)
        ret
    }
    @scala.inline
    def withForProcessed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withForbidden(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBindings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withIf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if")(js.undefined)
        ret
    }
    @scala.inline
    def withIfConditions(value: js.Array[ASTIfCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withIfProcessed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineTemplate(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withIterator1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterator1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterator1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterator1")(js.undefined)
        ret
    }
    @scala.inline
    def withIterator2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterator2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterator2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterator2")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: AnonCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeEvents(value: ASTElementHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withNs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(js.undefined)
        ret
    }
    @scala.inline
    def withOnce(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withOnceProcessed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnceProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: ASTElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessed(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processed")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: js.Array[AnonValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefInFor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refInFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefInFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refInFor")(js.undefined)
        ret
    }
    @scala.inline
    def withScopedSlots(value: Record[String, ASTElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopedSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopedSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopedSlots")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotName")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotScope")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrOptimizability(value: SSROptimizability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrOptimizability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrOptimizability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrOptimizability")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticClass")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticInFor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticInFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticInFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticInFor")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticProcessed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleBinding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionModeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionMode")(null)
        ret
    }
    @scala.inline
    def withTransitionOnAppear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionOnAppear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionOnAppear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionOnAppear")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapData(value: /* code */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWrapData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapData")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapListeners(value: /* code */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWrapListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapListeners")(js.undefined)
        ret
    }
  }
  
}

