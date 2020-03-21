package typingsSlinky.webpack.mod

import typingsSlinky.webpack.mod.Compiler_.Handler
import typingsSlinky.webpack.mod.Stats.ToJsonOptions
import typingsSlinky.webpack.mod.Stats.ToStringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated */
@JSImport("webpack", "compiler")
@js.native
object compiler extends js.Object {
  /** @deprecated use webpack.Compiler.Handler */
  type CompilerCallback = Handler
  /** @deprecated use webpack.Stats.ToJsonOptions */
  type StatsOptions = ToJsonOptions
  /** @deprecated use webpack.Stats.ToStringOptions */
  type StatsToStringOptions = ToStringOptions
  /** @deprecated use webpack.Compiler.WatchOptions */
  type WatchOptions = typingsSlinky.webpack.mod.Compiler_.WatchOptions
  /** @deprecated use webpack.Compiler.Watching */
  type Watching = typingsSlinky.webpack.mod.Compiler_.Watching
}

