'use strict';

// tag::vars[]
import React from 'react';
import ReactDOM from 'react-dom';
import client from './client';
import GameList from './games/game-list';
// end::vars[]

// tag::app[]
class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {games: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/games'}).done(response => {
            this.setState({games: response.entity._embedded.games});
        });
    }

    render() {
        return (
            <GameList games={this.state.games}/>
        )
    }
}
// end::app[]

// tag::render[]
ReactDOM.render(
    <App />,
    document.getElementById('react')
)
// end::render[]
