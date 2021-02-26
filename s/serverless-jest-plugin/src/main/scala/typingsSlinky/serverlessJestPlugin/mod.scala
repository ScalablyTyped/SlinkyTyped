package typingsSlinky.serverlessJestPlugin

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.awsLambda.handlerMod.Callback
import typingsSlinky.lambdaWrapper.anon.Handler
import typingsSlinky.lambdaWrapper.anon.LambdaFunction
import typingsSlinky.lambdaWrapper.anon.PartialContext
import typingsSlinky.lambdaWrapper.mod.Wrapped
import typingsSlinky.serverless.mod.Options
import typingsSlinky.serverless.pluginMod.Commands
import typingsSlinky.serverless.pluginMod.Hooks
import typingsSlinky.serverless.pluginMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serverless-jest-plugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends ServerlessJestPlugin {
    def this(serverless: typingsSlinky.serverless.mod.^, options: Options) = this()
  }
  
  @JSImport("serverless-jest-plugin", "getWrapper")
  @js.native
  def getWrapper(modName: String, modPath: String, handler: String): Wrapped[_, _] = js.native
  
  object lambdaWrapper {
    
    @JSImport("serverless-jest-plugin", "lambdaWrapper.init")
    @js.native
    def init(mod: js.Any, options: js.Any): Unit = js.native
    
    @JSImport("serverless-jest-plugin", "lambdaWrapper.run")
    @js.native
    def run(event: js.Any, callback: Callback[_]): js.Promise[_] = js.native
    @JSImport("serverless-jest-plugin", "lambdaWrapper.run")
    @js.native
    def run(event: js.Any, context: PartialContext, callback: Callback[_]): js.Promise[_] = js.native
    
    @JSImport("serverless-jest-plugin", "lambdaWrapper.wrap")
    @js.native
    def wrap(mod: LambdaFunction): Wrapped[_, _] = js.native
    @JSImport("serverless-jest-plugin", "lambdaWrapper.wrap")
    @js.native
    def wrap(mod: LambdaFunction, options: js.Object): Wrapped[_, _] = js.native
    @JSImport("serverless-jest-plugin", "lambdaWrapper.wrap")
    @js.native
    def wrap[TEvent, TResult, THandlerName /* <: String */](
      mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
      */ typingsSlinky.serverlessJestPlugin.serverlessJestPluginStrings.wrap with TopLevel[js.Any]
    ): Wrapped[TEvent, TResult] = js.native
    @JSImport("serverless-jest-plugin", "lambdaWrapper.wrap")
    @js.native
    def wrap[TEvent, TResult, THandlerName /* <: String */](
      mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
      */ typingsSlinky.serverlessJestPlugin.serverlessJestPluginStrings.wrap with TopLevel[js.Any],
      options: Handler[THandlerName]
    ): Wrapped[TEvent, TResult] = js.native
  }
  
  @js.native
  trait ServerlessJestPlugin extends Plugin {
    
    @JSName("commands")
    var commands_ServerlessJestPlugin: Commands = js.native
  }
  object ServerlessJestPlugin {
    
    @scala.inline
    def apply(commands: Commands, hooks: Hooks): ServerlessJestPlugin = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerlessJestPlugin]
    }
    
    @scala.inline
    implicit class ServerlessJestPluginMutableBuilder[Self <: ServerlessJestPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommands(value: Commands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    }
  }
}
