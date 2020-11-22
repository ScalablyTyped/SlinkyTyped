package typingsSlinky.tsJest

import typingsSlinky.bsLogger.loggerMod.Logger
import typingsSlinky.jestTransform.typesMod.CacheKeyOptions
import typingsSlinky.jestTransform.typesMod.Transformer
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.tsJest.configSetMod.ConfigSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-jest/dist/ts-jest-transformer", JSImport.Namespace)
@js.native
object tsJestTransformerMod extends js.Object {
  
  @js.native
  class TsJestTransformer () extends Transformer {
    
    var _transformCfgStr: String = js.native
    
    def configsFor(jestConfig: ProjectConfig): ConfigSet = js.native
    
    @JSName("getCacheKey")
    def getCacheKey_MTsJestTransformer(fileContent: String, filePath: String, _jestConfigStr: String, transformOptions: CacheKeyOptions): String = js.native
    
    val logger: Logger = js.native
  }
}
