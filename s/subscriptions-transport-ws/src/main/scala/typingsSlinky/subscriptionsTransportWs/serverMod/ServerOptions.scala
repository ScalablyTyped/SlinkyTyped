package typingsSlinky.subscriptionsTransportWs.serverMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.executeMod.ExecutionResultDataDefault
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.ValidationContext
import typingsSlinky.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  var execute: js.UndefOr[ExecuteFunction] = js.native
  var keepAlive: js.UndefOr[Double] = js.native
  var onConnect: js.UndefOr[js.Function] = js.native
  var onDisconnect: js.UndefOr[js.Function] = js.native
  var onOperation: js.UndefOr[js.Function] = js.native
  var onOperationComplete: js.UndefOr[js.Function] = js.native
  var rootValue: js.UndefOr[js.Any] = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
  var subscribe: js.UndefOr[SubscribeFunction] = js.native
  var validationRules: js.UndefOr[js.Array[_ | (js.Function1[/* context */ ValidationContext, _])]] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(
      value: (/* schema */ GraphQLSchema, /* document */ DocumentNode, /* rootValue */ js.UndefOr[js.Any], /* contextValue */ js.UndefOr[js.Any], /* variableValues */ js.UndefOr[StringDictionary[js.Any]], /* operationName */ js.UndefOr[String], /* fieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]]) => ExecutionResult[ExecutionResultDataDefault] | js.Promise[ExecutionResult[ExecutionResultDataDefault]] | (AsyncIterator[ExecutionResult[ExecutionResultDataDefault], js.Any, js.UndefOr[scala.Nothing]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAlive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnect(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisconnect(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDisconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOperation(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOperationComplete(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOperationComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOperationComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOperationComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRootValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribe(
      value: (/* schema */ GraphQLSchema, /* document */ DocumentNode, /* rootValue */ js.UndefOr[js.Any], /* contextValue */ js.UndefOr[js.Any], /* variableValues */ js.UndefOr[StringDictionary[js.Any]], /* operationName */ js.UndefOr[String], /* fieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]], /* subscribeFieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]]) => (AsyncIterator[ExecutionResult[ExecutionResultDataDefault], js.Any, js.UndefOr[scala.Nothing]]) | (js.Promise[
          (AsyncIterator[ExecutionResult[ExecutionResultDataDefault], js.Any, js.UndefOr[scala.Nothing]]) | ExecutionResult[ExecutionResultDataDefault]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withoutSubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Array[_ | (js.Function1[/* context */ ValidationContext, _])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
  }
  
}

