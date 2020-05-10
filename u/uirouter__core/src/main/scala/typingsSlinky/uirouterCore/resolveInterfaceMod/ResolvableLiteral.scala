package typingsSlinky.uirouterCore.resolveInterfaceMod

import typingsSlinky.uirouterCore.stateInterfaceMod.ResolveTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvableLiteral extends ResolveTypes {
  /** Pre-resolved data. */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The Dependency Injection tokens
    *
    * This is an array of Dependency Injection tokens for the dependencies of the [[resolveFn]].
    *
    * The DI tokens are references to other `Resolvables`, or to other
    * services from the native DI system.
    */
  var deps: js.UndefOr[js.Array[_]] = js.native
  /**
    * Defines the Resolve Policy
    *
    * A policy that defines when to invoke the resolve,
    * and whether to wait for async and unwrap the data
    */
  var policy: js.UndefOr[ResolvePolicy] = js.native
  /**
    * A function which fetches the Resolvable's data
    *
    * A function which returns one of:
    *
    * - The resolved value (synchronously)
    * - A promise for the resolved value
    * - An Observable of the resolved value(s)
    *
    * This function will be provided the dependencies listed in [[deps]] as its arguments.
    * The resolve system will asynchronously fetch the dependencies before invoking this function.
    */
  var resolveFn: js.Function = js.native
  /**
    * A Dependency Injection token
    *
    * This Resolvable's DI token.
    * The Resolvable will be injectable elsewhere using the token.
    */
  var token: js.Any = js.native
}

object ResolvableLiteral {
  @scala.inline
  def apply(resolveFn: js.Function, token: js.Any): ResolvableLiteral = {
    val __obj = js.Dynamic.literal(resolveFn = resolveFn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvableLiteral]
  }
  @scala.inline
  implicit class ResolvableLiteralOps[Self <: ResolvableLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolveFn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDeps(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: ResolvePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
  }
  
}

