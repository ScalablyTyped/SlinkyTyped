package typingsSlinky.yargs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Arguments[T] = T with typingsSlinky.yargs.anon.DictargName
  type AsyncCompletionFunction = js.Function3[
    /* current */ java.lang.String, 
    /* argv */ js.Any, 
    /* done */ js.Function1[/* completion */ js.Array[java.lang.String], scala.Unit], 
    scala.Unit
  ]
  type BuilderCallback[T, R] = js.Function1[
    /* args */ typingsSlinky.yargs.mod.Argv[T], 
    typingsSlinky.yargs.mod.Argv[R] | js.Thenable[typingsSlinky.yargs.mod.Argv[R]] | scala.Unit
  ]
  type Choices = js.Array[
    js.UndefOr[java.lang.String | scala.Double | typingsSlinky.yargs.yargsBooleans.`true`]
  ]
  /** Remove undefined as a possible value for keys K in T */
  type Defined[T, K /* <: /* keyof T */ java.lang.String */] = (typingsSlinky.yargs.mod.Omit[T, K]) with typingsSlinky.yargs.yargsStrings.Defined with org.scalablytyped.runtime.TopLevel[T]
  type InferredOptionTypes[O /* <: org.scalablytyped.runtime.StringDictionary[typingsSlinky.yargs.mod.Options] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof O ]: yargs.yargs.InferredOptionType<O[key]>}
    */ typingsSlinky.yargs.yargsStrings.InferredOptionTypes with org.scalablytyped.runtime.TopLevel[O]
  type MiddlewareFunction[T] = js.Function1[/* args */ typingsSlinky.yargs.mod.Arguments[T], scala.Unit]
  /** Remove keys K in T */
  type Omit[T, K] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof T, K> ]: T[key]}
    */ typingsSlinky.yargs.yargsStrings.Omit with org.scalablytyped.runtime.TopLevel[T]
  type ParseCallback[T] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* argv */ typingsSlinky.yargs.mod.Arguments[T], 
    /* output */ java.lang.String, 
    scala.Unit
  ]
  type PromiseCompletionFunction = js.Function2[
    /* current */ java.lang.String, 
    /* argv */ js.Any, 
    js.Promise[js.Array[java.lang.String]]
  ]
  type SyncCompletionFunction = js.Function2[/* current */ java.lang.String, /* argv */ js.Any, js.Array[java.lang.String]]
}
