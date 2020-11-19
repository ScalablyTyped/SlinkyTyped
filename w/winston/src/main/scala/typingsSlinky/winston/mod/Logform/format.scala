package typingsSlinky.winston.mod.Logform

import typingsSlinky.logform.mod.CliOptions
import typingsSlinky.logform.mod.ColorizeOptions
import typingsSlinky.logform.mod.FormatWrap
import typingsSlinky.logform.mod.JsonOptions
import typingsSlinky.logform.mod.LabelOptions
import typingsSlinky.logform.mod.MetadataOptions
import typingsSlinky.logform.mod.PadLevelsOptions
import typingsSlinky.logform.mod.PrettyPrintOptions
import typingsSlinky.logform.mod.TimestampOptions
import typingsSlinky.logform.mod.TransformFunction
import typingsSlinky.logform.mod.TransformableInfo
import typingsSlinky.logform.mod.UncolorizeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("winston", "Logform.format")
@js.native
object format extends js.Object {
  
  def apply(transform: TransformFunction): FormatWrap = js.native
  
  def align(): typingsSlinky.logform.mod.Format_ = js.native
  
  def cli(): typingsSlinky.logform.mod.Format_ = js.native
  def cli(opts: CliOptions): typingsSlinky.logform.mod.Format_ = js.native
  
  def colorize(): typingsSlinky.logform.mod.Colorizer = js.native
  def colorize(opts: ColorizeOptions): typingsSlinky.logform.mod.Colorizer = js.native
  
  def combine(formats: typingsSlinky.logform.mod.Format_ *): typingsSlinky.logform.mod.Format_ = js.native
  
  def errors(): typingsSlinky.logform.mod.Format_ = js.native
  def errors(opts: js.Object): typingsSlinky.logform.mod.Format_ = js.native
  
  def json(): typingsSlinky.logform.mod.Format_ = js.native
  def json(opts: JsonOptions): typingsSlinky.logform.mod.Format_ = js.native
  
  def label(): typingsSlinky.logform.mod.Format_ = js.native
  def label(opts: LabelOptions): typingsSlinky.logform.mod.Format_ = js.native
  
  def logstash(): typingsSlinky.logform.mod.Format_ = js.native
  
  def metadata(): typingsSlinky.logform.mod.Format_ = js.native
  def metadata(opts: MetadataOptions): typingsSlinky.logform.mod.Format_ = js.native
  
  def ms(): typingsSlinky.logform.mod.Format_ = js.native
  
  def padLevels(): typingsSlinky.logform.mod.Format_ = js.native
  def padLevels(opts: PadLevelsOptions): typingsSlinky.logform.mod.Format_ = js.native
  
  def prettyPrint(): typingsSlinky.logform.mod.Format_ = js.native
  def prettyPrint(opts: PrettyPrintOptions): typingsSlinky.logform.mod.Format_ = js.native
  
  def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): typingsSlinky.logform.mod.Format_ = js.native
  
  def simple(): typingsSlinky.logform.mod.Format_ = js.native
  
  def splat(): typingsSlinky.logform.mod.Format_ = js.native
  
  def timestamp(): typingsSlinky.logform.mod.Format_ = js.native
  def timestamp(opts: TimestampOptions): typingsSlinky.logform.mod.Format_ = js.native
  
  def uncolorize(): typingsSlinky.logform.mod.Format_ = js.native
  def uncolorize(opts: UncolorizeOptions): typingsSlinky.logform.mod.Format_ = js.native
}
