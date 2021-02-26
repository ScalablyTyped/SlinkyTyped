package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.commonCommonMod.Obj
import typingsSlinky.uirouterCore.libUrlMod.UrlConfig
import typingsSlinky.uirouterCore.paramMod.DefType
import typingsSlinky.uirouterCore.paramsInterfaceMod.ParamTypeDefinition
import typingsSlinky.uirouterCore.paramsInterfaceMod.RawParams
import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paramsMod {
  
  @JSImport("@uirouter/core/lib/params", "DefType")
  @js.native
  object DefType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uirouterCore.paramMod.DefType with Double] = js.native
    
    /* 2 */ val CONFIG: typingsSlinky.uirouterCore.paramMod.DefType.CONFIG with Double = js.native
    
    /* 0 */ val PATH: typingsSlinky.uirouterCore.paramMod.DefType.PATH with Double = js.native
    
    /* 1 */ val SEARCH: typingsSlinky.uirouterCore.paramMod.DefType.SEARCH with Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/params", "Param")
  @js.native
  class Param protected ()
    extends typingsSlinky.uirouterCore.paramMod.Param {
    def this(
      id: String,
      `type`: typingsSlinky.uirouterCore.paramTypeMod.ParamType,
      location: DefType,
      urlConfig: UrlConfig,
      state: StateDeclaration
    ) = this()
  }
  /* static members */
  object Param {
    
    /**
      * Finds [[Param]] objects which have different param values
      *
      * Filters a list of [[Param]] objects to only those whose parameter values differ in two param value objects
      *
      * @param params: The list of Param objects to filter
      * @param values1: The first set of parameter values
      * @param values2: the second set of parameter values
      *
      * @returns any Param objects whose values were different between values1 and values2
      */
    @JSImport("@uirouter/core/lib/params", "Param.changed")
    @js.native
    def changed(params: js.Array[typingsSlinky.uirouterCore.paramMod.Param]): js.Array[typingsSlinky.uirouterCore.paramMod.Param] = js.native
    @JSImport("@uirouter/core/lib/params", "Param.changed")
    @js.native
    def changed(
      params: js.Array[typingsSlinky.uirouterCore.paramMod.Param],
      values1: js.UndefOr[scala.Nothing],
      values2: RawParams
    ): js.Array[typingsSlinky.uirouterCore.paramMod.Param] = js.native
    @JSImport("@uirouter/core/lib/params", "Param.changed")
    @js.native
    def changed(params: js.Array[typingsSlinky.uirouterCore.paramMod.Param], values1: RawParams): js.Array[typingsSlinky.uirouterCore.paramMod.Param] = js.native
    @JSImport("@uirouter/core/lib/params", "Param.changed")
    @js.native
    def changed(
      params: js.Array[typingsSlinky.uirouterCore.paramMod.Param],
      values1: RawParams,
      values2: RawParams
    ): js.Array[typingsSlinky.uirouterCore.paramMod.Param] = js.native
    
    /**
      * Checks if two param value objects are equal (for a set of [[Param]] objects)
      *
      * @param params The list of [[Param]] objects to check
      * @param values1 The first set of param values
      * @param values2 The second set of param values
      *
      * @returns true if the param values in values1 and values2 are equal
      */
    @JSImport("@uirouter/core/lib/params", "Param.equals")
    @js.native
    def equals(params: js.Array[typingsSlinky.uirouterCore.paramMod.Param]): Boolean = js.native
    @JSImport("@uirouter/core/lib/params", "Param.equals")
    @js.native
    def equals(
      params: js.Array[typingsSlinky.uirouterCore.paramMod.Param],
      values1: js.UndefOr[scala.Nothing],
      values2: js.Object
    ): Boolean = js.native
    @JSImport("@uirouter/core/lib/params", "Param.equals")
    @js.native
    def equals(params: js.Array[typingsSlinky.uirouterCore.paramMod.Param], values1: js.Object): Boolean = js.native
    @JSImport("@uirouter/core/lib/params", "Param.equals")
    @js.native
    def equals(
      params: js.Array[typingsSlinky.uirouterCore.paramMod.Param],
      values1: js.Object,
      values2: js.Object
    ): Boolean = js.native
    
    /** Returns true if a the parameter values are valid, according to the Param definitions */
    @JSImport("@uirouter/core/lib/params", "Param.validates")
    @js.native
    def validates(params: js.Array[typingsSlinky.uirouterCore.paramMod.Param]): Boolean = js.native
    @JSImport("@uirouter/core/lib/params", "Param.validates")
    @js.native
    def validates(params: js.Array[typingsSlinky.uirouterCore.paramMod.Param], values: RawParams): Boolean = js.native
    
    @JSImport("@uirouter/core/lib/params", "Param.values")
    @js.native
    def values(params: js.Array[typingsSlinky.uirouterCore.paramMod.Param]): RawParams = js.native
    @JSImport("@uirouter/core/lib/params", "Param.values")
    @js.native
    def values(params: js.Array[typingsSlinky.uirouterCore.paramMod.Param], values: RawParams): RawParams = js.native
  }
  
  @JSImport("@uirouter/core/lib/params", "ParamType")
  @js.native
  class ParamType protected ()
    extends typingsSlinky.uirouterCore.paramTypeMod.ParamType {
    /**
      * @param def  A configuration object which contains the custom type definition.  The object's
      *        properties will override the default methods and/or pattern in `ParamType`'s public interface.
      * @returns a new ParamType object
      */
    def this(`def`: ParamTypeDefinition) = this()
  }
  
  @JSImport("@uirouter/core/lib/params", "ParamTypes")
  @js.native
  class ParamTypes ()
    extends typingsSlinky.uirouterCore.paramTypesMod.ParamTypes
  /* static members */
  object ParamTypes {
    
    @JSImport("@uirouter/core/lib/params", "ParamTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Built-in parameter type: `any`
      *
      * This parameter type is used by default for url-less parameters (parameters that do not appear in the URL).
      * This type does not encode or decode.
      * It is compared using a deep `equals` comparison.
      *
      * #### Example:
      * This example defines a non-url parameter on a [[StateDeclaration]].
      * ```js
      * .state({
      *   name: 'new',
      *   url: '/new',
      *   params: {
      *     inrepyto: null
      *   }
      * });
      * ```
      * ```js
      * $state.go('new', { inreplyto: currentMessage });
      * ```
      */
    @JSImport("@uirouter/core/lib/params", "ParamTypes.any")
    @js.native
    def any: ParamTypeDefinition = js.native
    @scala.inline
    def any_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `bool`
      *
      * This parameter type serializes `true`/`false` as `1`/`0`
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'inbox',
      *   url: '/inbox?{unread:bool}'
      * });
      * ```
      * ```js
      * $state.go('inbox', { unread: true });
      * ```
      *
      * The URL will serialize to: `/inbox?unread=1`.
      *
      * Conversely, if the url is `/inbox?unread=0`, the value of the `unread` parameter will be a `false`.
      */
    @JSImport("@uirouter/core/lib/params", "ParamTypes.bool")
    @js.native
    def bool: ParamTypeDefinition = js.native
    @scala.inline
    def bool_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `date`
      *
      * This parameter type can be used to serialize Javascript dates as parameter values.
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'search',
      *   url: '/search?{start:date}'
      * });
      * ```
      * ```js
      * $state.go('search', { start: new Date(2000, 0, 1) });
      * ```
      *
      * The URL will serialize to: `/search?start=2000-01-01`.
      *
      * Conversely, if the url is `/search?start=2016-12-25`, the value of the `start` parameter will be a `Date` object where:
      *
      * - `date.getFullYear() === 2016`
      * - `date.getMonth() === 11` (month is 0-based)
      * - `date.getDate() === 25`
      */
    @JSImport("@uirouter/core/lib/params", "ParamTypes.date")
    @js.native
    def date: ParamTypeDefinition = js.native
    @scala.inline
    def date_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `hash`
      *
      * This parameter type is used for the `#` parameter (the hash)
      * It behaves the same as the [[string]] parameter type.
      */
    @JSImport("@uirouter/core/lib/params", "ParamTypes.hash")
    @js.native
    def hash: ParamTypeDefinition = js.native
    @scala.inline
    def hash_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `int`
      *
      * This parameter type serializes javascript integers (`number`s which represent an integer) to the URL.
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'user',
      *   url: '/user/{id:int}'
      * });
      * ```
      * ```js
      * $state.go('user', { id: 1298547 });
      * ```
      *
      * The URL will serialize to: `/user/1298547`.
      *
      * When the parameter value is read, it will be the `number` `1298547`, not the string `"1298547"`.
      */
    @JSImport("@uirouter/core/lib/params", "ParamTypes.int")
    @js.native
    def int: ParamTypeDefinition = js.native
    @scala.inline
    def int_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `json`
      *
      * This parameter type can be used to serialize javascript objects into the URL using JSON serialization.
      *
      * #### Example:
      * This example serializes an plain javascript object to the URL
      * ```js
      * .state({
      *   name: 'map',
      *   url: '/map/{coords:json}'
      * });
      * ```
      * ```js
      * $state.go('map', { coords: { x: 10399.2, y: 49071 });
      * ```
      *
      * The URL will serialize to: `/map/%7B%22x%22%3A10399.2%2C%22y%22%3A49071%7D`
      */
    @JSImport("@uirouter/core/lib/params", "ParamTypes.json")
    @js.native
    def json: ParamTypeDefinition = js.native
    @scala.inline
    def json_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `path`
      *
      * This parameter type is the default type for path parameters.
      * A path parameter is any parameter declared in the path portion of a url
      *
      * - `/foo/:param1/:param2`: two path parameters
      *
      * This parameter type behaves exactly like the [[string]] type with one exception.
      * When matching parameter values in the URL, the `path` type does not match forward slashes `/`.
      *
      * #### Angular 1 note:
      * In ng1, this type is overridden with one that pre-encodes slashes as `~2F` instead of `%2F`.
      * For more details about this angular 1 behavior, see: https://github.com/angular-ui/ui-router/issues/2598
      */
    @JSImport("@uirouter/core/lib/params", "ParamTypes.path")
    @js.native
    def path: ParamTypeDefinition = js.native
    @scala.inline
    def path_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `query`
      *
      * This parameter type is the default type for query/search parameters.
      * It behaves the same as the [[string]] parameter type.
      *
      * A query parameter is any parameter declared in the query/search portion of a url
      *
      * - `/bar?param2`: a query parameter
      */
    @JSImport("@uirouter/core/lib/params", "ParamTypes.query")
    @js.native
    def query: ParamTypeDefinition = js.native
    @scala.inline
    def query_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("query")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `string`
      *
      * This parameter type coerces values to strings.
      * It matches anything (`new RegExp(".*")`) in the URL
      */
    @JSImport("@uirouter/core/lib/params", "ParamTypes.string")
    @js.native
    def string: ParamTypeDefinition = js.native
    @scala.inline
    def string_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@uirouter/core/lib/params", "StateParams")
  @js.native
  class StateParams ()
    extends typingsSlinky.uirouterCore.stateParamsMod.StateParams {
    def this(params: Obj) = this()
  }
}
