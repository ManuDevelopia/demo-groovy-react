
import React from 'react';
import Game from './game';

// tag::game-list[]
class GameList extends React.Component{
    render() {
        var games = this.props.games.map(game =>
            <Game key={game._links.self.href} game={game}/>
        );
        return (
            <table>
                <tbody>
                <tr>
                    <th>Name</th>
                </tr>
                {games}
                </tbody>
            </table>
        )
    }
}
// end::game-list[]

export default GameList;