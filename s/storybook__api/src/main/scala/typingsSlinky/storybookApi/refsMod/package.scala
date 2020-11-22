package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object refsMod {
  
  type RefId = java.lang.String
  
  type RefUrl = java.lang.String
  
  type Refs = typingsSlinky.std.Record[java.lang.String, typingsSlinky.storybookApi.refsMod.ComposedRef]
  
  type StoryMapper = js.Function2[
    /* ref */ typingsSlinky.storybookApi.refsMod.ComposedRef, 
    /* story */ typingsSlinky.storybookApi.storiesMod.StoryInput, 
    typingsSlinky.storybookApi.storiesMod.StoryInput
  ]
  
  type Versions = typingsSlinky.std.Record[java.lang.String, java.lang.String]
}
