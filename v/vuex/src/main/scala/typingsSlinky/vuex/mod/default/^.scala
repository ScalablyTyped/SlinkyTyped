package typingsSlinky.vuex.mod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Record
import typingsSlinky.vuex.anon.FnCall
import typingsSlinky.vuex.helpersMod.ActionMethod
import typingsSlinky.vuex.helpersMod.Computed
import typingsSlinky.vuex.helpersMod.CustomVue
import typingsSlinky.vuex.helpersMod.Mapper
import typingsSlinky.vuex.helpersMod.MapperForAction
import typingsSlinky.vuex.helpersMod.MapperForActionWithNamespace
import typingsSlinky.vuex.helpersMod.MapperForMutation
import typingsSlinky.vuex.helpersMod.MapperForMutationWithNamespace
import typingsSlinky.vuex.helpersMod.MapperForState
import typingsSlinky.vuex.helpersMod.MapperForStateWithNamespace
import typingsSlinky.vuex.helpersMod.MapperWithNamespace
import typingsSlinky.vuex.helpersMod.MutationMethod
import typingsSlinky.vuex.helpersMod.NamespacedMappers
import typingsSlinky.vuex.loggerMod.LoggerOption
import typingsSlinky.vuex.mod.Commit
import typingsSlinky.vuex.mod.Dispatch
import typingsSlinky.vuex.mod.Plugin
import typingsSlinky.vuex.mod.StoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vuex", JSImport.Default)
@js.native
object ^ extends js.Object {
  
  var Store: Instantiable1[
    /* options */ StoreOptions[/* import warning: RewrittenClass.unapply cls was tparam S */ js.Any], 
    typingsSlinky.vuex.mod.Store[js.Object]
  ] = js.native
  
  def createLogger[S](): Plugin[S] = js.native
  def createLogger[S](option: LoggerOption[S]): Plugin[S] = js.native
  @JSName("createLogger")
  var createLogger_Original: FnCall = js.native
  
  def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
  @JSName("createNamespacedHelpers")
  var createNamespacedHelpers_Original: js.Function1[/* namespace */ String, NamespacedMappers] = js.native
  
  def install(Vue: /* import warning: importer.ImportType#apply Failed type conversion: typeof _Vue */ js.Any): Unit = js.native
  @JSName("install")
  var install_Original: js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof _Vue */ /* Vue */ js.Any, 
    Unit
  ] = js.native
  
  def mapActions[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  def mapActions[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  def mapActions[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  def mapActions[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  @JSName("mapActions")
  def mapActions_Map_RecordStringThisFunction2CustomVueDispatchWildcardWildcard[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ _, _]
  ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[Map] = js.native
  @JSName("mapActions")
  def mapActions_Map_RecordStringThisFunction2CustomVueDispatchWildcardWildcard[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ _, _]
  ] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[Map] = js.native
  @JSName("mapActions")
  var mapActions_Original: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with MapperForAction with MapperForActionWithNamespace = js.native
  
  def mapGetters[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  def mapGetters[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  def mapGetters[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  def mapGetters[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  @JSName("mapGetters")
  var mapGetters_Original: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  
  def mapMutations[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ _, _]
  ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[Map] = js.native
  def mapMutations[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  def mapMutations[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ _, _]
  ] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[Map] = js.native
  def mapMutations[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  @JSName("mapMutations")
  def mapMutations_Map_RecordStringString[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  @JSName("mapMutations")
  def mapMutations_Map_RecordStringString[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  @JSName("mapMutations")
  var mapMutations_Original: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with MapperForMutation with MapperForMutationWithNamespace = js.native
  
  def mapState[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  def mapState[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  def mapState[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  def mapState[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[js.Any] = js.native
  @JSName("mapState")
  var mapState_Original: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  @JSName("mapState")
  def mapState_SMap_RecordStringThisFunction2CustomVueSWildcardWildcard[S, Map /* <: Record[String, js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[Map] = js.native
  @JSName("mapState")
  def mapState_SMap_RecordStringThisFunction2CustomVueSWildcardWildcard[S, Map /* <: Record[String, js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
    */ typingsSlinky.vuex.vuexStrings.^  with TopLevel[Map] = js.native
}
