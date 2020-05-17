package typingsSlinky.sinon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SinonStatic = typingsSlinky.sinon.mod.SinonSandbox with typingsSlinky.sinon.mod.LegacySandbox with typingsSlinky.sinon.mod.SinonApi
  /**
    * An instance of a stubbed object type with functions replaced by stubs.
    *
    * @template TType Object type being stubbed.
    */
  type SinonStubbedInstance[TType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TType ]: sinon.sinon.SinonStubbedMember<TType[P]>}
    */ typingsSlinky.sinon.sinonStrings.SinonStubbedInstance with org.scalablytyped.runtime.TopLevel[TType]
  type SinonTimerId = typingsSlinky.sinonjsFakeTimers.mod.TimerId
}
