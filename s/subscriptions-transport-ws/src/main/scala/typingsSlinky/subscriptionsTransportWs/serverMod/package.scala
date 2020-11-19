package typingsSlinky.subscriptionsTransportWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serverMod {
  
  type ExecuteFunction = js.Function7[
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    /* document */ typingsSlinky.graphql.astMod.DocumentNode, 
    /* rootValue */ js.UndefOr[js.Any], 
    /* contextValue */ js.UndefOr[js.Any], 
    /* variableValues */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* operationName */ js.UndefOr[java.lang.String], 
    /* fieldResolver */ js.UndefOr[
      typingsSlinky.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    (typingsSlinky.graphql.executeMod.ExecutionResult[
      org.scalablytyped.runtime.StringDictionary[js.Any], 
      org.scalablytyped.runtime.StringDictionary[js.Any]
    ]) | (js.Promise[
      typingsSlinky.graphql.executeMod.ExecutionResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        org.scalablytyped.runtime.StringDictionary[js.Any]
      ]
    ]) | (typingsSlinky.std.AsyncIterator[
      typingsSlinky.graphql.executeMod.ExecutionResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        org.scalablytyped.runtime.StringDictionary[js.Any]
      ], 
      js.Any, 
      js.UndefOr[scala.Nothing]
    ])
  ]
  
  type ExecutionIterator = typingsSlinky.std.AsyncIterator[
    typingsSlinky.graphql.executeMod.ExecutionResult[
      org.scalablytyped.runtime.StringDictionary[js.Any], 
      org.scalablytyped.runtime.StringDictionary[js.Any]
    ], 
    js.Any, 
    js.UndefOr[scala.Nothing]
  ]
  
  type SubscribeFunction = js.Function8[
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    /* document */ typingsSlinky.graphql.astMod.DocumentNode, 
    /* rootValue */ js.UndefOr[js.Any], 
    /* contextValue */ js.UndefOr[js.Any], 
    /* variableValues */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* operationName */ js.UndefOr[java.lang.String], 
    /* fieldResolver */ js.UndefOr[
      typingsSlinky.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    /* subscribeFieldResolver */ js.UndefOr[
      typingsSlinky.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    (typingsSlinky.std.AsyncIterator[
      typingsSlinky.graphql.executeMod.ExecutionResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        org.scalablytyped.runtime.StringDictionary[js.Any]
      ], 
      js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | (js.Promise[
      (typingsSlinky.std.AsyncIterator[
        typingsSlinky.graphql.executeMod.ExecutionResult[
          org.scalablytyped.runtime.StringDictionary[js.Any], 
          org.scalablytyped.runtime.StringDictionary[js.Any]
        ], 
        js.Any, 
        js.UndefOr[scala.Nothing]
      ]) | (typingsSlinky.graphql.executeMod.ExecutionResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        org.scalablytyped.runtime.StringDictionary[js.Any]
      ])
    ])
  ]
}
