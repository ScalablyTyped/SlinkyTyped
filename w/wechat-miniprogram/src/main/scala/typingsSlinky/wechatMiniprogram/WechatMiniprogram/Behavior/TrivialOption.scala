package typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Record
import typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.RelationOption
import typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject
import typingsSlinky.wechatMiniprogram.anon.PartialILifetime
import typingsSlinky.wechatMiniprogram.anon.PartialPageLifetimes
import typingsSlinky.wechatMiniprogram.anon.Partialcreatedvoidattache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.WechatMiniprogram.Behavior.Options<wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, std.Record<string, never>> */
@js.native
trait TrivialOption extends js.Object {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  
  var behaviors: js.UndefOr[js.Array[BehaviorIdentifier]] = js.native
  
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  
  var data: js.UndefOr[IAnyObject] = js.native
  
  var definitionFilter: js.UndefOr[typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter] = js.native
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  
  var error: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
  
  var externalClasses: js.UndefOr[js.Array[String]] = js.native
  
  var lifetimes: js.UndefOr[Partialcreatedvoidattache] = js.native
  
  var methods: js.UndefOr[IAnyObject with (js.Object | PartialILifetime)] = js.native
  
  var moved: js.UndefOr[js.Function0[Unit]] = js.native
  
  var observers: js.UndefOr[Record[String, js.Function1[/* repeated */ _, _]]] = js.native
  
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.native
  
  var properties: js.UndefOr[IAnyObject] = js.native
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  
  var relations: js.UndefOr[StringDictionary[RelationOption]] = js.native
}
object TrivialOption {
  
  @scala.inline
  def apply(): TrivialOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrivialOption]
  }
  
  @scala.inline
  implicit class TrivialOptionOps[Self <: TrivialOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttached(value: () => Unit): Self = this.set("attached", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    
    @scala.inline
    def setBehaviorsVarargs(value: BehaviorIdentifier*): Self = this.set("behaviors", js.Array(value :_*))
    
    @scala.inline
    def setBehaviors(value: js.Array[BehaviorIdentifier]): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehaviors: Self = this.set("behaviors", js.undefined)
    
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setData(value: IAnyObject): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDefinitionFilter(
      value: (/* defFields */ typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.TrivialOption, /* definitionFilterArr */ js.UndefOr[
          js.Array[
            /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias wechat-miniprogram.WechatMiniprogram.Component.DefinitionFilter */ js.Object
          ]
        ]) => Unit
    ): Self = this.set("definitionFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDefinitionFilter: Self = this.set("definitionFilter", js.undefined)
    
    @scala.inline
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    
    @scala.inline
    def setError(value: /* err */ js.Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExternalClassesVarargs(value: String*): Self = this.set("externalClasses", js.Array(value :_*))
    
    @scala.inline
    def setExternalClasses(value: js.Array[String]): Self = this.set("externalClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalClasses: Self = this.set("externalClasses", js.undefined)
    
    @scala.inline
    def setLifetimes(value: Partialcreatedvoidattache): Self = this.set("lifetimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifetimes: Self = this.set("lifetimes", js.undefined)
    
    @scala.inline
    def setMethods(value: IAnyObject with (js.Object | PartialILifetime)): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setMoved(value: () => Unit): Self = this.set("moved", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteMoved: Self = this.set("moved", js.undefined)
    
    @scala.inline
    def setObservers(value: Record[String, js.Function1[/* repeated */ _, _]]): Self = this.set("observers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservers: Self = this.set("observers", js.undefined)
    
    @scala.inline
    def setPageLifetimes(value: PartialPageLifetimes): Self = this.set("pageLifetimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLifetimes: Self = this.set("pageLifetimes", js.undefined)
    
    @scala.inline
    def setProperties(value: IAnyObject): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setRelations(value: StringDictionary[RelationOption]): Self = this.set("relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
  }
}
