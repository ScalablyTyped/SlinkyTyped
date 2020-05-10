package typingsSlinky.tslint.walkerWalkerMod

import typingsSlinky.tslint.ruleMod.RuleFailure
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWalker extends js.Object {
  def getFailures(): js.Array[RuleFailure] = js.native
  def getSourceFile(): SourceFile = js.native
  def walk(sourceFile: SourceFile): Unit = js.native
}

object IWalker {
  @scala.inline
  def apply(
    getFailures: () => js.Array[RuleFailure],
    getSourceFile: () => SourceFile,
    walk: SourceFile => Unit
  ): IWalker = {
    val __obj = js.Dynamic.literal(getFailures = js.Any.fromFunction0(getFailures), getSourceFile = js.Any.fromFunction0(getSourceFile), walk = js.Any.fromFunction1(walk))
    __obj.asInstanceOf[IWalker]
  }
  @scala.inline
  implicit class IWalkerOps[Self <: IWalker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFailures(value: () => js.Array[RuleFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFailures")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceFile(value: () => SourceFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWalk(value: SourceFile => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walk")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

