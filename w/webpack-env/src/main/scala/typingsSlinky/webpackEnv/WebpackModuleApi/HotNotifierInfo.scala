package typingsSlinky.webpackEnv.WebpackModuleApi

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.webpackEnv.webpackEnvStrings.`accept-errored`
import typingsSlinky.webpackEnv.webpackEnvStrings.`self-accept-error-handler-errored`
import typingsSlinky.webpackEnv.webpackEnvStrings.`self-accept-errored`
import typingsSlinky.webpackEnv.webpackEnvStrings.`self-declined`
import typingsSlinky.webpackEnv.webpackEnvStrings.accepted
import typingsSlinky.webpackEnv.webpackEnvStrings.declined
import typingsSlinky.webpackEnv.webpackEnvStrings.disposed
import typingsSlinky.webpackEnv.webpackEnvStrings.unaccepted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotNotifierInfo extends js.Object {
  /**
    * For declined/accepted/unaccepted: the chain from where the update was propagated.
    */
  var chain: js.UndefOr[js.Array[Double]] = js.native
  /**
    * For errors: the module id owning the accept handler.
    */
  var dependencyId: js.UndefOr[Double] = js.native
  /**
    * For errors: the thrown error
    */
  var error: js.UndefOr[js.Error] = js.native
  /**
    * The module in question.
    */
  var moduleId: Double = js.native
  /**
    * For self-accept-error-handler-errored: the error thrown by the module
    * before the error handler tried to handle it.
    */
  var originalError: js.UndefOr[js.Error] = js.native
  /**
    * For accepted: The location of accept handlers that will handle the update
    */
  var outdatedDependencies: js.UndefOr[NumberDictionary[js.Array[Double]]] = js.native
  /**
    * For accepted: the modules that are outdated and will be disposed
    */
  var outdatedModules: js.UndefOr[js.Array[Double]] = js.native
  /**
    * For declined: the module id of the declining parent
    */
  var parentId: js.UndefOr[Double] = js.native
  var `type`: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored` = js.native
}

object HotNotifierInfo {
  @scala.inline
  def apply(
    moduleId: Double,
    `type`: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored`
  ): HotNotifierInfo = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotNotifierInfo]
  }
  @scala.inline
  implicit class HotNotifierInfoOps[Self <: HotNotifierInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModuleId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChain(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chain")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencyId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyId")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalError")(js.undefined)
        ret
    }
    @scala.inline
    def withOutdatedDependencies(value: NumberDictionary[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outdatedDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutdatedDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outdatedDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withOutdatedModules(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outdatedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutdatedModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outdatedModules")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
  }
  
}

