package typingsSlinky.shelljs.makeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.processMod.global.NodeJS.ProcessEnv
import typingsSlinky.shelljs.mod.CatFunction
import typingsSlinky.shelljs.mod.ChmodFunction
import typingsSlinky.shelljs.mod.CopyFunction
import typingsSlinky.shelljs.mod.DirsFunction
import typingsSlinky.shelljs.mod.EchoFunction
import typingsSlinky.shelljs.mod.ExecFunction
import typingsSlinky.shelljs.mod.FindFunction
import typingsSlinky.shelljs.mod.GrepFunction
import typingsSlinky.shelljs.mod.HeadFunction
import typingsSlinky.shelljs.mod.LinkFunction
import typingsSlinky.shelljs.mod.ListFunction
import typingsSlinky.shelljs.mod.MkdirFunction
import typingsSlinky.shelljs.mod.MoveFunction
import typingsSlinky.shelljs.mod.PopDirFunction
import typingsSlinky.shelljs.mod.PushDirFunction
import typingsSlinky.shelljs.mod.RemoveFunction
import typingsSlinky.shelljs.mod.SedFunction
import typingsSlinky.shelljs.mod.ShellConfig
import typingsSlinky.shelljs.mod.ShellStringConstructor
import typingsSlinky.shelljs.mod.SortFunction
import typingsSlinky.shelljs.mod.TailFunction
import typingsSlinky.shelljs.mod.TouchFunction
import typingsSlinky.shelljs.mod.UniqFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  trait Target_ extends js.Object {
    var done: js.UndefOr[Boolean] = js.native
    var result: js.UndefOr[js.Any] = js.native
    def apply(args: js.Any*): Unit = js.native
  }
  
  val ShellString: ShellStringConstructor = js.native
  val cat: CatFunction = js.native
  val cd: js.Function1[/* dir */ js.UndefOr[String], typingsSlinky.shelljs.mod.ShellString] = js.native
  val chmod: ChmodFunction = js.native
  val config: ShellConfig = js.native
  val cp: CopyFunction = js.native
  val dirs: DirsFunction = js.native
  val echo: EchoFunction = js.native
  val env: ProcessEnv = js.native
  val error: js.Function0[typingsSlinky.shelljs.mod.ShellString] = js.native
  val exec: ExecFunction = js.native
  val exit: js.Function1[/* code */ js.UndefOr[Double], scala.Nothing] = js.native
  val find: FindFunction = js.native
  val grep: GrepFunction = js.native
  val head: HeadFunction = js.native
  val ln: LinkFunction = js.native
  val ls: ListFunction = js.native
  val mkdir: MkdirFunction = js.native
  val mv: MoveFunction = js.native
  val popd: PopDirFunction = js.native
  val pushd: PushDirFunction = js.native
  val pwd: js.Function0[typingsSlinky.shelljs.mod.ShellString] = js.native
  val rm: RemoveFunction = js.native
  val sed: SedFunction = js.native
  val set: js.Function1[/* options */ String, Unit] = js.native
  val sort: SortFunction = js.native
  val tail: TailFunction = js.native
  val tempdir: js.Function0[typingsSlinky.shelljs.mod.ShellString] = js.native
  val touch: TouchFunction = js.native
  val uniq: UniqFunction = js.native
  @js.native
  object target extends /* s */ StringDictionary[Target_] {
    var all: js.UndefOr[Target_] = js.native
  }
  
}

