
import React from 'react';

// tag::game[]
class Game extends React.Component{
    render() {
        return (
            <tr>
                <td>{this.props.game.name}</td>
            </tr>
        )
    }
}
// end::game[]

export default Game;