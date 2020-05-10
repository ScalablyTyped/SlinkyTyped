package typingsSlinky.vueTemplateCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleOptions extends js.Object {
  var staticKeys: js.UndefOr[js.Array[String]] = js.native
  var transformCode: js.UndefOr[js.Function2[/* el */ ASTElement, /* code */ String, String]] = js.native
  def genData(el: ASTElement): String = js.native
  def postTransformNode(el: ASTElement): Unit = js.native
  def preTransformNode(el: ASTElement): js.UndefOr[ASTElement] = js.native
  def transformNode(el: ASTElement): js.UndefOr[ASTElement] = js.native
}

object ModuleOptions {
  @scala.inline
  def apply(
    genData: ASTElement => String,
    postTransformNode: ASTElement => Unit,
    preTransformNode: ASTElement => js.UndefOr[ASTElement],
    transformNode: ASTElement => js.UndefOr[ASTElement]
  ): ModuleOptions = {
    val __obj = js.Dynamic.literal(genData = js.Any.fromFunction1(genData), postTransformNode = js.Any.fromFunction1(postTransformNode), preTransformNode = js.Any.fromFunction1(preTransformNode), transformNode = js.Any.fromFunction1(transformNode))
    __obj.asInstanceOf[ModuleOptions]
  }
  @scala.inline
  implicit class ModuleOptionsOps[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenData(value: ASTElement => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPostTransformNode(value: ASTElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTransformNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreTransformNode(value: ASTElement => js.UndefOr[ASTElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTransformNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformNode(value: ASTElement => js.UndefOr[ASTElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStaticKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformCode(value: (/* el */ ASTElement, /* code */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformCode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransformCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformCode")(js.undefined)
        ret
    }
  }
  
}

