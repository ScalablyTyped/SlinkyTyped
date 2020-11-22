package typingsSlinky.yog2Kernel.mod

import typingsSlinky.express.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.lodash.mod.Collection
import typingsSlinky.lodash.mod.Function
import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.LoDashStatic
import typingsSlinky.lodash.mod.Object
import typingsSlinky.lodash.mod.Primitive
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import typingsSlinky.yog2Kernel.anon.CleanCache
import typingsSlinky.yog2Kernel.anon.TypeofRAL
import typingsSlinky.yog2Kernel.anon.TypeofRALPromise
import typingsSlinky.yog2Kernel.anon.Typeofexpress
import typingsSlinky.yogLog.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Yog extends js.Object {
  
  var DEBUG: Boolean = js.native
  
  var PLUGINS_PATH: String = js.native
  
  var PLUGIN_TIMEOUT: String | Double = js.native
  
  var RAL: TypeofRAL = js.native
  
  var ROOT_PATH: String = js.native
  
  @JSName("_")
  def _underscore(): typingsSlinky.lodash.mod.String = js.native
  @JSName("_")
  def _underscore(value: String): typingsSlinky.lodash.mod.String = js.native
  @JSName("_")
  def _underscore[T /* <: js.Object */](value: T): Object[T] = js.native
  @JSName("_")
  def _underscore[T](value: List[T]): Collection[T] = js.native
  @JSName("_")
  var _underscore_Original: LoDashStatic = js.native
  @JSName("_")
  def _underscore_T_Collection[T](): Collection[T] = js.native
  @JSName("_")
  def _underscore_T_Function1AnyWildcard_Function[T /* <: js.Function1[/* args */ js.Any, _] */](value: T): Function[T] = js.native
  @JSName("_")
  def _underscore_T_Object_Object[T /* <: js.Object */](): Object[T] = js.native
  @JSName("_")
  def _underscore_T_Primitive[T](value: T): Primitive[T] = js.native
  @JSName("_")
  def `_underscore_T_UnionNull<undefined>_Primitive`[T /* <: js.UndefOr[Null] */](value: T): Primitive[T] = js.native
  /**
    * Creates a lodash object which wraps value to enable implicit method chain sequences.
    * Methods that operate on and return arrays, collections, and functions can be chained together.
    * Methods that retrieve a single value or may return a primitive value will automatically end the
    * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
    *
    * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
    *
    * The execution of chained methods is lazy, that is, it's deferred until value() is
    * implicitly or explicitly called.
    *
    * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
    * is an optimization to merge iteratee calls; this avoids the creation of intermediate
    * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
    * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
    * accept only one argument. The heuristic for whether a section qualifies for shortcut
    * fusion is subject to change.
    *
    * Chaining is supported in custom builds as long as the value() method is directly or
    * indirectly included in the build.
    *
    * In addition to lodash methods, wrappers have Array and String methods.
    * The wrapper Array methods are:
    * concat, join, pop, push, shift, sort, splice, and unshift.
    * The wrapper String methods are:
    * replace and split.
    *
    * The wrapper methods that support shortcut fusion are:
    * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
    * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
    *
    * The chainable wrapper methods are:
    * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
    * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
    * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
    * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
    * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
    * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
    * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
    * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
    * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
    * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
    * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
    * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
    * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
    * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
    * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
    * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
    *
    * The wrapper methods that are not chainable by default are:
    * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
    * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
    * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
    * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
    * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
    * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
    * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
    * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
    * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
    * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
    * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
    * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
    * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
    * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
    * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
    * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
    * upperFirst, value, and words.
    **/
  @JSName("_")
  def _underscore_TrapAny_TrapAny_Intersection[TrapAny /* <: typingsSlinky.lodash.anon.TrapAny */](value: TrapAny): Collection[_] with Function[_] with Object[_] with Primitive[_] with typingsSlinky.lodash.mod.String = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(
    req: typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, ParsedQs],
    res: typingsSlinky.expressServeStaticCore.mod.Response[_, Double]
  ): js.Any = js.native
  def app(
    req: typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, ParsedQs],
    res: ServerResponse
  ): js.Any = js.native
  def app(req: IncomingMessage, res: typingsSlinky.expressServeStaticCore.mod.Response[_, Double]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("app")
  var app_Original: Express = js.native
  
  def bootstrap(option: YogBootstrapOption): Unit = js.native
  def bootstrap(option: YogBootstrapOption, callback: js.Function0[Unit]): Unit = js.native
  
  def express(): typingsSlinky.expressServeStaticCore.mod.Express = js.native
  @JSName("express")
  var express_Original: js.Function0[typingsSlinky.expressServeStaticCore.mod.Express] with Typeofexpress = js.native
  
  var log: Logger = js.native
  
  // 当 yog.conf.promise.overrideRAL 为true时，可以当作promise使用
  var ral: TypeofRAL | TypeofRALPromise = js.native
  
  var ralP: TypeofRALPromise = js.native
  
  // debug模式时存在
  var reloadApp: js.UndefOr[js.Function1[/* appName */ String, Unit]] = js.native
  
  // debug模式时存在
  var reloadIsomorphic: js.UndefOr[js.Function0[Unit]] = js.native
  
  // debug模式时存在
  var reloadView: js.UndefOr[js.Function0[Unit]] = js.native
  
  def require(moduleName: String): js.Any = js.native
  
  var view: CleanCache = js.native
}
