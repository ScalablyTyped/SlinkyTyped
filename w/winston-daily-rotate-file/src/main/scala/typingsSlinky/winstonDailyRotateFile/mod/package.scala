package typingsSlinky.winstonDailyRotateFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DailyRotateFileTransportOptions = typingsSlinky.winstonDailyRotateFile.mod.RequireOnlyOne[
    typingsSlinky.winstonDailyRotateFile.mod.GeneralDailyRotateFileTransportOptions, 
    typingsSlinky.winstonDailyRotateFile.winstonDailyRotateFileStrings.filename | typingsSlinky.winstonDailyRotateFile.winstonDailyRotateFileStrings.stream
  ]
  
  // referenced from https://stackoverflow.com/questions/40510611/typescript-interface-require-one-of-two-properties-to-exist
  type RequireOnlyOne[T, Keys /* <: /* keyof T */ java.lang.String */] = (typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, Keys]]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
}
