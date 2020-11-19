package typingsSlinky.zookeeper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ACL = scala.Double | typingsSlinky.zookeeper.anon.Auth
  
  type Callback[T] = js.Function3[/* rc */ scala.Double, /* error */ java.lang.String, /* value */ T, scala.Unit]
  
  type aclCallback = js.Function4[
    /* rc */ scala.Double, 
    /* error */ java.lang.String, 
    /* acl */ js.Array[typingsSlinky.zookeeper.mod.ACL], 
    /* stat */ typingsSlinky.zookeeper.mod.Stat, 
    scala.Unit
  ]
  
  type child2Callback = js.Function4[
    /* rc */ scala.Double, 
    /* error */ java.lang.String, 
    /* children */ js.Array[java.lang.String], 
    /* stat */ typingsSlinky.zookeeper.mod.Stat, 
    scala.Unit
  ]
  
  type watchCallback = js.Function3[
    /* type */ scala.Double, 
    /* state */ scala.Double, 
    /* path */ java.lang.String, 
    scala.Unit
  ]
}
