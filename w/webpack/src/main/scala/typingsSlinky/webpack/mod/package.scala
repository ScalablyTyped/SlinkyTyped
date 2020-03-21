package typingsSlinky.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BannerPlugin = typingsSlinky.webpack.mod.BannerPlugin_
  /**
    * @deprecated Use RuleSetCondition instead
    */
  type Condition = typingsSlinky.webpack.mod.RuleSetCondition
  type ConfigurationFactory = js.Function2[
    /* env */ java.lang.String | (typingsSlinky.std.Record[java.lang.String, scala.Boolean | scala.Double | java.lang.String]), 
    /* args */ typingsSlinky.webpack.mod.CliConfigOptions, 
    typingsSlinky.webpack.mod.Configuration | js.Promise[typingsSlinky.webpack.mod.Configuration]
  ]
  type DllPlugin = typingsSlinky.webpack.mod.DllPlugin_
  type DllReferencePlugin = typingsSlinky.webpack.mod.DllReferencePlugin_
  type Entry = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type EntryFunc = js.Function0[
    java.lang.String | js.Array[java.lang.String] | typingsSlinky.webpack.mod.Entry | (js.Promise[java.lang.String | js.Array[java.lang.String] | typingsSlinky.webpack.mod.Entry])
  ]
  type EvalSourceMapDevToolPlugin = typingsSlinky.webpack.mod.EvalSourceMapDevToolPlugin_
  /** @deprecated use webpack.EvalSourceMapDevToolPlugin.Options */
  type EvalSourceMapDevToolPluginOptions = typingsSlinky.webpack.mod.EvalSourceMapDevToolPlugin.Options
  type ExternalsElement = java.lang.String | js.RegExp | typingsSlinky.webpack.mod.ExternalsObjectElement | typingsSlinky.webpack.mod.ExternalsFunctionElement
  type ExternalsFunctionElement = js.Function3[
    /* context */ js.Any, 
    /* request */ js.Any, 
    /* callback */ js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit], 
    js.Any
  ]
  type ExternalsObjectElement = org.scalablytyped.runtime.StringDictionary[
    scala.Boolean | java.lang.String | js.Array[java.lang.String] | (typingsSlinky.std.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]])
  ]
  type ICompiler = typingsSlinky.webpack.mod.ICompiler_
  type Loader_ = java.lang.String | typingsSlinky.webpack.mod.NewLoader
  type MultiConfigurationFactory = js.Function2[
    /* env */ java.lang.String | (typingsSlinky.std.Record[java.lang.String, scala.Boolean | scala.Double | java.lang.String]), 
    /* args */ typingsSlinky.webpack.mod.CliConfigOptions, 
    js.Array[typingsSlinky.webpack.mod.Configuration] | js.Promise[js.Array[typingsSlinky.webpack.mod.Configuration]]
  ]
  /** @deprecated use webpack.Options.Performance */
  type PerformanceOptions = typingsSlinky.webpack.mod.Options.Performance
  /**
    * @deprecated Use RuleSetRule instead
    */
  type Rule = typingsSlinky.webpack.mod.RuleSetRule
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.std.RegExp
    - java.lang.String
    - js.Function1[/ * path * / java.lang.String, scala.Boolean]
    - typingsSlinky.webpack.mod.RuleSetConditions
    - typingsSlinky.webpack.AnonAnd
  */
  type RuleSetCondition = typingsSlinky.webpack.mod._RuleSetCondition | (js.Function1[/* path */ java.lang.String, scala.Boolean]) | js.RegExp | java.lang.String
  type RuleSetQuery = java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]
  type RuleSetUse = typingsSlinky.webpack.mod.RuleSetUseItem | js.Array[typingsSlinky.webpack.mod.RuleSetUseItem] | (js.Function1[
    /* data */ js.Any, 
    typingsSlinky.webpack.mod.RuleSetUseItem | js.Array[typingsSlinky.webpack.mod.RuleSetUseItem]
  ])
  type RuleSetUseItem = java.lang.String | typingsSlinky.webpack.mod.RuleSetLoader | (js.Function1[/* data */ js.Any, java.lang.String | typingsSlinky.webpack.mod.RuleSetLoader])
  type SourceMapDevToolPlugin = typingsSlinky.webpack.mod.SourceMapDevToolPlugin_
  /** @deprecated use webpack.SourceMapDevToolPlugin.Options */
  type SourceMapDevToolPluginOptions = typingsSlinky.webpack.mod.SourceMapDevToolPlugin.Options
  type Stats = typingsSlinky.webpack.mod.Stats_
  /** @deprecated use webpack.optimize.UglifyJsPlugin.CommentFilter */
  type UglifyCommentFunction = typingsSlinky.webpack.mod.optimize.UglifyJsPlugin.CommentFilter
  /** @deprecated use webpack.optimize.UglifyJsPlugin.Options */
  type UglifyPluginOptions = typingsSlinky.webpack.mod.optimize.UglifyJsPlugin.Options
  /** @deprecated use webpack.Options.WatchOptions */
  type WatchOptions = typingsSlinky.webpack.mod.Options.WatchOptions
}
