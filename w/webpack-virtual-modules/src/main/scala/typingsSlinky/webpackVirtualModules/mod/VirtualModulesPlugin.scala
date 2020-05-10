package typingsSlinky.webpackVirtualModules.mod

import typingsSlinky.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugin that allows dynamic generation of in-memory virtual modules for JavaScript builds
  * created with webpack.
  */
@js.native
trait VirtualModulesPlugin extends js.Object {
  /**
    * Attaches necessary hooks, in particular, `afterEnvironment`, `afterResolvers`, and `watchRun` hooks,
    * to ensure that the virtual files are added dynamically.
    */
  @JSName("apply")
  def apply(compiler: Compiler_): Unit = js.native
  /**
    * Writes a static or dynamic virtual module to a path.
    */
  def writeModule(filePath: String, fileContents: String): Unit = js.native
}

object VirtualModulesPlugin {
  @scala.inline
  def apply(apply: Compiler_ => Unit, writeModule: (String, String) => Unit): VirtualModulesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), writeModule = js.Any.fromFunction2(writeModule))
    __obj.asInstanceOf[VirtualModulesPlugin]
  }
  @scala.inline
  implicit class VirtualModulesPluginOps[Self <: VirtualModulesPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: Compiler_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteModule(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeModule")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

