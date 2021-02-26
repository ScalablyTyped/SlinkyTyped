package typingsSlinky.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionCommandMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.CommandModule * / any */ @JSImport("typeorm/commands/VersionCommand", "VersionCommand")
  @js.native
  class VersionCommand () extends StObject {
    
    var command: String = js.native
    
    var describe: String = js.native
    
    def handler(): js.Promise[Unit] = js.native
  }
  /* static members */
  object VersionCommand {
    
    @JSImport("typeorm/commands/VersionCommand", "VersionCommand.executeCommand")
    @js.native
    def executeCommand(command: String): js.Promise[String] = js.native
  }
}
