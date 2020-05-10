package typingsSlinky.tslint.ruleMod

import typingsSlinky.tslint.walkerWalkerMod.IWalker
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRule extends js.Object {
  @JSName("apply")
  def apply(sourceFile: SourceFile): js.Array[RuleFailure] = js.native
  def applyWithWalker(walker: IWalker): js.Array[RuleFailure] = js.native
  def getOptions(): IOptions = js.native
  def isEnabled(): Boolean = js.native
}

object IRule {
  @scala.inline
  def apply(
    apply: SourceFile => js.Array[RuleFailure],
    applyWithWalker: IWalker => js.Array[RuleFailure],
    getOptions: () => IOptions,
    isEnabled: () => Boolean
  ): IRule = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyWithWalker = js.Any.fromFunction1(applyWithWalker), getOptions = js.Any.fromFunction0(getOptions), isEnabled = js.Any.fromFunction0(isEnabled))
    __obj.asInstanceOf[IRule]
  }
  @scala.inline
  implicit class IRuleOps[Self <: IRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: SourceFile => js.Array[RuleFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplyWithWalker(value: IWalker => js.Array[RuleFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyWithWalker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOptions(value: () => IOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

