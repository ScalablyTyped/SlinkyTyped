package typingsSlinky.standardEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LintCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* results */ typingsSlinky.eslint.mod.CLIEngine.LintReport, 
    scala.Unit
  ]
  type LintFilesOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.standardEngine.mod.Options, 
    typingsSlinky.standardEngine.standardEngineStrings.cwd | typingsSlinky.standardEngine.standardEngineStrings.filename
  ]) with typingsSlinky.standardEngine.mod.LintDefaultOptions
  type LintTextOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.standardEngine.mod.Options, 
    typingsSlinky.standardEngine.standardEngineStrings.ignore | typingsSlinky.standardEngine.standardEngineStrings.cwd
  ]) with typingsSlinky.standardEngine.mod.LintDefaultOptions
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type PickWithSomeRequired[T, TRequired /* <: /* keyof T */ java.lang.String */] = (typingsSlinky.standardEngine.mod.Omit[T, TRequired]) with (typingsSlinky.std.Pick[typingsSlinky.std.Required[T], TRequired])
}
